package typesystem

import Errors
import MyError
import kernel.antlr.kernelParser
import kernel.antlr.kernelParser.ExpressionContext
import symboltable.Scope

class ExpressionTypeChecker(
    val typeSystem: TypeSystem,
    val errors: Errors
) {
    private val typePrecedence = listOf(TSType("float2"), TSType("float"), TSType("int"))
    private val builtInMethods = mapOf("get_global_id" to TSType("int"))
    private lateinit var ctx: ExpressionContext
    fun getExpressionType(currentScope: Scope, expression: ExpressionContext): TSType {
        ctx = expression
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

        if (!typesAreCompatible(resultType, typeRight, typeLeft)) {
            errors.add(MyError("Types are not compatible! (${typeRight.type} and ${typeLeft.type})", ctx?.start?.line!!, ctx.start?.charPositionInLine!!))
            print(errors.getErrors())
        }

        return resultType.type
    }

    fun typesAreCompatible(
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
        }  else if (variable == "true" || variable == "false") {
            return typeSystem.types["bool"]!!
        } else if (variable.startsWith("\"")
            && variable.endsWith("\"")
            && variable.filter { it == '"' }.length == 2
        ) {
            return typeSystem.types["string"]!!
        } else if (variable.contains(".x") || variable.contains(".y")) {
            return typeSystem.types["float2"]!!
        }

        var currScope: Scope? = currentScope
        val index = if (variable.indexOf("[") < 0) variable.length else variable.indexOf("[")
        val scopeName = variable.substring(0, index)
        while (currScope != null) {
            if (currScope.keys.contains(scopeName)) {
                return currScope[scopeName]?.type!!
            }
            currScope = currScope.parent
        }

        val index2 = if (variable.indexOf("(") < 0) variable.length else variable.indexOf("(")
        val purelyName = variable.substring(0, index2)
        if (builtInMethods.keys.contains(purelyName))
            return builtInMethods[purelyName]!!

        errors.add(MyError("No type defined for variable ${variable}!", ctx?.start?.line!!, ctx.start?.charPositionInLine!!))
        print(errors.getErrors())
        return typeSystem.types["ErrorType"]!!
    }

}