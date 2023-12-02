package typesystem

import kernel.antlr.kernelParser
import symboltable.Scope

class ExpressionTypeChecker(
    val typeSystem: TypeSystem
) {
    private val typePrecedence = listOf(TSType("float2"), TSType("float"), TSType("int"))

    fun getExpressionType(currentScope: Scope, expression: kernelParser.ExpressionContext): TSType {
        val types = mutableListOf<TSType>()

        if (expression.prefixOperator() != null) {
            types.add(getType(currentScope, expression.prefixOperator().variable().text))
        } else if (expression.postfixOperator() != null) {
            types.add(getType(currentScope, expression.postfixOperator().variable().text))
        } else if (expression.binaryOperator() != null) {
            types.add(getBinaryOperatorType(currentScope, expression.binaryOperator()))
        } else if (expression.literal() != null) {
            types.add(getType(currentScope, expression.literal().text))
        }

        expression.expression().forEach { types.add(getExpressionType(currentScope, it)) }

        return determineResultType(types)
    }

    private fun getBinaryOperatorType(currentScope: Scope, binaryOperator: kernelParser.BinaryOperatorContext): TSType {
        val types = mutableListOf<TSType>()

        types.add(getType(currentScope, binaryOperator.literal(0).text))

        if (binaryOperator.binaryOperator() != null) {
            types.add(getBinaryOperatorType(currentScope, binaryOperator.binaryOperator()))
        }

        if (binaryOperator.literal().size > 1) {
            types.add(getType(currentScope, binaryOperator.literal(1).text))
        }

        return determineResultType(types)
    }

    fun getReturnType(currentScope: Scope, rhs: String?, lhs: String?): String {

        if (rhs == null || lhs == null) {
            return "null"
        }

        val typeRight = getType(currentScope, rhs)
        val typeLeft = getType(currentScope, lhs)
        val resultType = determineResultType(listOf(typeRight, typeLeft))

        if (typesAreCompatible(resultType, typeRight, typeLeft)) {
            throw RuntimeException("The types on the 2 sides of the expression are not the same!")
        }

        return resultType.type
    }

    private fun typesAreCompatible(
        resultType: TSType,
        typeRight: TSType,
        typeLeft: TSType
    ) = resultType.type != typeRight.type && resultType.type != typeLeft.type

    fun valueConverter(value: String, convertTo: String, convertFrom: String): String {
        if (convertFrom == "float") {
            if (convertTo == "int") {
                return value.substring(0, value.indexOf('.'))
            }
        }

        if (isClass(convertFrom) && typeSystem.isParent(convertFrom, convertTo)) {
            return value;
        }

        return "";
    }

    fun isClass(type: String): Boolean {
        return !typeSystem.getBuiltInTypes().contains(type)
    }

    private fun determineResultType(types: List<TSType>): TSType {
        typePrecedence.forEach { tp ->
            if (types.map { it.type }.toSet().contains(tp.type))
                return tp
        }
        return typeSystem.types["ErrorType"]!!
    }

    fun getType(currentScope: Scope, variable: String): TSType {

        if (variable.toIntOrNull() != null) {
            return typeSystem.types["int"]!!
        } else if (variable.toFloatOrNull() != null) {
            return typeSystem.types["float"]!!
        } else if (variable.startsWith("\"")
            && variable.endsWith("\"")
            && variable.filter { it == '"' }.length == 2
        ) {
            return typeSystem.types["string"]!!
        } else if (variable.contains(".x") || variable.contains(".y")) {
            return typeSystem.types["float2"]!!
        }

        var currScope: Scope? = currentScope;
        while (currScope != null) {
            if (currScope.keys.contains(variable)) {
                return currScope[variable]?.type!!
            }
            currScope = currScope.parent
        }

        throw RuntimeException("No type defined for variable ${variable}!")
    }

}