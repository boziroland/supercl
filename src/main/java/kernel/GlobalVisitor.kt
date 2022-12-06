package kernel

import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import org.apache.commons.lang3.StringUtils
import symboltable.ClassSymbol
import symboltable.MethodSymbol
import symboltable.Scope
import symboltable.Symbol
import typesystem.TSType

class GlobalVisitor : kernelBaseVisitor<Any>() {

    private val globalScope = Scope(parent = null, name = "GLOBAL")

    override fun visitProgram(ctx: kernelParser.ProgramContext?): Any {
        super.visitProgram(ctx)

        return globalScope
    }

    override fun visitDeclaration(ctx: kernelParser.DeclarationContext?) {
        val isBuiltInType = !StringUtils.isBlank(ctx?.TYPE()?.text)
        val type = ctx?.TYPE()?.text ?: ctx?.WORD(0)?.text
        val varName = if (isBuiltInType) ctx?.WORD(0)?.text else ctx?.WORD(1)?.text

        if (ctx?.WORD()?.size == 2 && isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), ctx?.WORD(1)?.text!!))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (type ${getType(varName!!)}")
            }
        }

        else if (ctx?.WORD()?.size == 2 && !isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), ctx?.methodCall()?.WORD(0)?.text!!))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (type ${getType(varName!!)})")
            }
        }

        else if (ctx?.WORD()?.size == 3)
        {
            if (!isCorrectType(TSType(type!!), ctx?.WORD(2)?.text!!))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (type ${getType(varName!!)}")
            }
        }

        if (!StringUtils.isBlank(ctx?.MEMORY_QUALIFIER()?.text))
        {
            if (globalScope[varName!!] != null)
            {
                throw RuntimeException("Variable already defined!")
            }
        }
        globalScope[varName!!] = Symbol(varName, TSType(type!!))

        super.visitDeclaration(ctx)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) {
        val className = ctx?.WORD(0)?.text!!

        if (globalScope[className] != null)
        {
            throw RuntimeException("Class already defined!")
        }

        val clazz = ClassSymbol(className)
        val properties = ctx.WORD().subList(1, ctx.WORD().size)
        val types = ctx.TYPE().subList(0, ctx.TYPE().size)

        if (types.size != properties.size)
        {
            throw RuntimeException("Property - Type mismatch!")
        }

        properties.forEachIndexed { i, e -> clazz.properties[e.text] = TSType(types[i].text) }
        globalScope[className] = clazz

        super.visitClass(ctx)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext) {
        val retVal = ctx?.methodHeader()?.TYPE()?.text ?: ctx?.methodHeader()?.KERNEL()?.text!!
        val name = ctx.methodHeader()?.WORD()?.text!!
        val params = ctx.methodHeader().parameter();

        if (globalScope[name] != null)
        {
            throw RuntimeException("Method already defined!")
        }

        val method = MethodSymbol(name, TSType(retVal))
        params.forEach { p -> method.parameters[p.WORD().text] = TSType(p.TYPE().text) }

        globalScope[name] = method

        super.visitMethod(ctx)
    }

    override fun visitIf(ctx: kernelParser.IfContext?) {

    }

    fun isCorrectType(lhs: TSType, rhs: String): Boolean {
        return lhs.type == globalScope[rhs]?.type?.type ||
                globalScope[rhs]?.type?.parents?.contains(lhs)!!
    }

    fun isCorrectType(lhs: String, rhs: String): Boolean {
        return globalScope[lhs]?.type == globalScope[rhs]?.type ||
                globalScope[rhs]?.type?.parents?.contains(globalScope[lhs]?.type)!!
    }

    fun getType(variable: String): TSType? {

        if (variable.toIntOrNull() != null) {
            return TSType("int")
        } else if (variable.toFloatOrNull() != null) {
            return TSType("float")
        }

        return globalScope[variable]?.type
    }
}