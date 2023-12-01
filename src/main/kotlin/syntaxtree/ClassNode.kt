package syntaxtree

import kernel.antlr.kernelParser
import symboltable.ClassSymbol
import symboltable.MethodSymbol
import symboltable.Scope
import symboltable.Symbol

class ClassNode(
    parent: SyntaxTreeNode?,
    val classContext: kernelParser.ClassContext,
    private val parentClassNode: ClassNode?,
    private val globalScope: Scope,
    private val tabCounter: Int
) : SyntaxTreeNode(parent) {

    data class Variable(val type: String, var name: String) {}

    private val classProperties = mutableListOf<Variable>()

    override fun toCode(): String {
        var ret = ""

        val className = classContext.className(0).text
        val parentClassName = if (classContext.className().size > 1) classContext.className(1).text else ""
        val vars = classContext.WORD()

        vars.forEachIndexed { index, variable ->
            classProperties.add(Variable(classContext.typeName(index).text, variable.text))
        }

        ret += createVariables(className)

        if (parentClassName.isNotEmpty()) {
            val parentClass = getClass(parentClassName, globalScope) as ClassSymbol

            for (variable in parentClass.properties) {
                classProperties.add(Variable(variable.value.type, variable.key))
            }

            for (method in parentClass.methods) {
                ret += createHeaderIncludingParentProperties(method)
                ret += MethodBodyNode(this,
                    parentClassNode!!.classContext.method()
                        .filter { it.methodHeader().WORD().text == method.name }[0].methodBody(),
                    tabCounter
                ).toCode()
            }
        }

        val methods = classContext.method()

        for (method in methods) {
            ret += createHeader(method)
            ret += MethodBodyNode(this, method.methodBody(), tabCounter).toCode()
        }

        return ret
    }

    private fun getClass(className: String, scope: Scope): Symbol? {
        for (child in scope) {
            val childName = child.key
            if (className == childName)
                return child.value
        }
        return null
    }

    private fun createHeader(method: kernelParser.MethodContext): Any? {
        var ret = ""

        val header = method.methodHeader()
        ret +=
            if (header.KERNEL() != null)
                header.KERNEL().text + " void "
            else
                header.typeName().text + " "

        ret += method.methodHeader().WORD().text + "("

        for (methodParam in method.methodHeader().parameter()) {
            ret += methodParam.MEMORY_QUALIFIER()?.text ?: ""
            ret += " "
            ret += methodParam.typeName().text
            ret += " "
            ret += methodParam.WORD().text
            ret += ", "
        }

        for (property in classProperties) {
            ret += property.type
            ret += " "
            ret += property.name
            ret += ", "
        }

        ret = ret.substring(0, ret.length - 2)
        ret += ")"

        return ret
    }

    private fun createHeaderIncludingParentProperties(method: MethodSymbol): String {
        var ret = ""

        ret +=
            if (method.memoryQualifier != "")
                method.memoryQualifier + " void "
            else
                method.type.type + " "

        ret += method.name + "("

        for (methodParam in method.parameters) {
            ret += methodParam.memoryQualifier
            ret += " "
            ret += methodParam.type.type
            ret += " "
            ret += methodParam.name
            ret += ", "
        }

        for (property in classProperties) {
            ret += property.type
            ret += " "
            ret += property.name
            ret += ", "
        }

        ret = ret.substring(0, ret.length - 2)
        ret += ")"

        return ret
    }

    private fun createVariables(className: String): String {
        var ret = " ".repeat((tabCounter) * 4) + "typedef struct $className {\n"

        for (classProperty in classProperties) {
            ret += " ".repeat((tabCounter + 1) * 4) + "${classProperty.type} ${classProperty.name};\n"
        }

        ret += " ".repeat((tabCounter) * 4) + "} $className;\n"

        return ret
    }

}