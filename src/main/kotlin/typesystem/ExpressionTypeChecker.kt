package typesystem

import symboltable.Scope

class ExpressionTypeChecker(
    val typeSystem: TypeSystem
) {
    private val typePrecedence = listOf("float", "int")

    fun getReturnType(currentScope: Scope, rhs: String?, lhs: String?): String {

        if (rhs == null || lhs == null) {
            return "null"
        }

        val typeRight = getType(currentScope, rhs).type
        val typeLeft = getType(currentScope, lhs).type
        val resultType = determineResultType(typeRight, typeLeft)

        if (resultType != typeRight && resultType != typeLeft) {
            throw RuntimeException("The types on the 2 sides of the expression are not the same!")
        }

        return resultType
    }

    private fun determineResultType(rhs: String, lhs: String): String {
        return if (typePrecedence.indexOf(rhs) < typePrecedence.indexOf(lhs)) rhs else lhs
    }

    private fun getType(currentScope: Scope, variable: String): TSType {

        if (variable.toIntOrNull() != null) {
            return typeSystem.types["int"]!!
        } else if (variable.toFloatOrNull() != null) {
            return typeSystem.types["float"]!!
        } else if (variable.startsWith("\"")
            && variable.endsWith("\"")
            && variable.filter { it == '"' }.length == 2
        ) {
            return typeSystem.types["string"]!!
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