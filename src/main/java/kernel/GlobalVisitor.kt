package kernel

import Errors
import MyError
import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.ParserRuleContext
import org.apache.commons.lang3.StringUtils
import symboltable.ClassSymbol
import symboltable.MethodSymbol
import symboltable.Scope
import symboltable.Symbol
import typesystem.TSType
import typesystem.TypeSystem

class GlobalVisitor : kernelBaseVisitor<Any>() {

    private val globalScope = Scope(parent = null, name = "GLOBAL")
    private val errors = Errors()
    val typeSystem = TypeSystem()

    override fun visitProgram(ctx: kernelParser.ProgramContext?): Any {
        globalScope["print"] = MethodSymbol("print", TSType("void"))
        super.visitProgram(ctx)

        print(errors.getErrors())

        return globalScope
    }

    override fun visitDeclaration(ctx: kernelParser.DeclarationContext?) {
        val isBuiltInType = !StringUtils.isBlank(ctx?.typeName()?.text)
        val type = ctx?.typeName()?.text ?: throw RuntimeException("No variable type given!")
        val varName = ctx?.variable(0)?.text ?: throw RuntimeException("No variable name given!")
        val tType = TSType(type)
        val rhs : String? = ctx?.variable(1)?.text?: ctx?.REALNUMBER()?.text ?: ctx?.methodCall()?.text ?: ctx?.STRING()?.text ?: ctx?.expression()?.text ?: ctx?.WORD()?.text

        if (/*ctx?.WORD()?.size == 2 && */isBuiltInType)
        {
            if (!isCorrectType(tType, rhs))
            {
                errors.add(MyError("Variable on right side of assignment to ${varName} is of incorrect type! (type ${getType(varName)}",
                ctx.start.line, ctx.start.charPositionInLine))
            }
        }

        else if (/*ctx?.WORD()?.size == 2 && */!isBuiltInType)
        {
            if (!isCorrectType(tType, ctx?.methodCall()?.WORD(0)?.text))
            {
                errors.add(MyError("Variable on right side of assignment" +
                        " to $varName is of incorrect type! (type ${getType(varName)})", ctx.start.line, ctx.start.charPositionInLine))
            }
        }

//        else if (ctx?.WORD()?.size == 3)
//        {
//            if (!isCorrectType(tType, ctx?.WORD(2)?.text))
//            {
//                errors.add(MyError("Variable on right side of assignment" +
//                        " to $varName is of incorrect type! (type ${getType(varName)})", ctx.start.line, ctx.start.charPositionInLine))
//            }
//        }

        if (!StringUtils.isBlank(ctx?.MEMORY_QUALIFIER()?.text))
        {
            if (globalScope[varName] != null)
            {
                if (ctx != null) { // TODO
                    errors.add(MyError("Variable already defined!", ctx.start.line, ctx.start.charPositionInLine))
                }
            }
        }

        globalScope[varName!!] = Symbol(varName, tType)

        super.visitDeclaration(ctx)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) {
        val className = ctx?.className(0)?.text ?: throw RuntimeException("No class name given!")
        val parentClass = if (ctx.EXTENDS()?.text == "extends") ctx.className(1).text else null

        if (globalScope[className] != null)
        {
            errors.add(MyError("Class already defined!", ctx.start.line, ctx.start.charPositionInLine))
        }

        val type = TSType(className)
        if (parentClass != null)
        {
            if (globalScope[parentClass] != null)
            {
                type.parents.add(TSType(parentClass))
            }
            else
            {
                errors.add(MyError("No such parent class defined!", ctx.start.line, ctx.start.charPositionInLine))
            }
        }
        typeSystem.addType(type)

        val clazz = ClassSymbol(className, parentClass)
        val properties = ctx.WORD()
        val methods = ctx.method()

        val types = ctx?.typeName()!!.subList(0, ctx?.typeName()!!.size)

        if (types.size != properties.size)
        {
            errors.add(MyError("Property - Type mismatch!", ctx.start.line, ctx.start.charPositionInLine))
        }

        properties.forEachIndexed { i, p -> clazz.properties[p.text] = TSType(types[i].text) }
        methods.forEach{ m -> clazz.methods[(m.children[0] as ParserRuleContext).children[1].text] =
            TSType((m.children[0] as ParserRuleContext).children[0].text)}
        globalScope[className] = clazz

        super.visitClass(ctx)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext) {
        val retVal = ctx?.methodHeader()?.typeName()?.text ?: ctx?.methodHeader()?.KERNEL()?.text  ?: throw RuntimeException("No return value name given!")
        val name = ctx.methodHeader()?.WORD()?.text ?: throw RuntimeException("No method name given!")
        val params = ctx.methodHeader().parameter();

        if (globalScope[name] != null)
        {
            errors.add(MyError("Method already defined!", ctx.start.line, ctx.start.charPositionInLine))
        }

        val method = MethodSymbol(name, TSType(retVal))
        params.forEach { p -> method.parameters[p.WORD().text] = TSType(p.typeName().text) }

        globalScope[name] = method

    }

    override fun visitIf(ctx: kernelParser.IfContext?) {}

    private fun isCorrectType(lhs: TSType, rhs: String?): Boolean {
        return lhs.type == globalScope[rhs]?.type?.type ||
                globalScope[rhs]?.type?.parents?.contains(lhs) == true ||
                lhs.type == getType(rhs)?.type
    }

    fun isCorrectType(lhs: String, rhs: String): Boolean {
        return globalScope[lhs]?.type == globalScope[rhs]?.type ||
                globalScope[rhs]?.type?.parents?.contains(globalScope[lhs]?.type) == true
    }

    fun getType(variable: String?): TSType? {

        if (variable?.toIntOrNull() != null) {
            return typeSystem.types["int"]
        } else if (variable?.toFloatOrNull() != null) {
            return typeSystem.types["float"]
        }

        return typeSystem.types[variable]
    }
}