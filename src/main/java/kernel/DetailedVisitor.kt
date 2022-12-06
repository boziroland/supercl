package kernel

import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import org.apache.commons.lang3.StringUtils
import symboltable.Scope
import symboltable.Symbol
import typesystem.TSType
import typesystem.TypeSystem

class DetailedVisitor : kernelBaseVisitor<Any>() {

    lateinit var globalScope: Scope
    lateinit var typeSystem: TypeSystem
    lateinit var currentScope: Scope

    override fun visitProgram(ctx: kernelParser.ProgramContext?) {

        currentScope = globalScope

        super.visitProgram(ctx)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) { // dataclass
        val name = ctx?.text
        val vars = ctx?.WORD()

        currentScope = Scope(parent = currentScope, name = name!!)
        vars!!.forEach { e -> currentScope[name] = Symbol(e.text, TSType(name)) }

        super.visitClass(ctx).also {
            currentScope = currentScope.parent!!
        }
    }

    override fun visitParameter(ctx: kernelParser.ParameterContext?) {
        val type = ctx?.TYPE()?.text!!
        val name = ctx.WORD()?.text

        currentScope = Scope(parent = currentScope, name = name!!)
        currentScope[name] = Symbol(name, TSType(type))

        super.visitParameter(ctx)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext?): Any {
        val methodName = ctx?.methodHeader()?.WORD()?.text!!
        val retVal = ctx?.methodHeader()?.TYPE()?.text ?: ctx?.methodHeader()?.KERNEL()?.text!!
        val assignments = ctx.block()?.statement()?.filter { a -> a.assignment() != null }

        if (!isInScope(methodName)) {
            throw RuntimeException("No such method defined!")
        }

        currentScope = Scope(parent = currentScope, name = methodName!!)

        assignments?.forEach { a ->
            run {
                val varName = a.assignment().WORD(0).text
                currentScope[varName] = Symbol(varName, TSType(retVal))
            }
        }

        return super.visitMethod(ctx).also {
            currentScope = currentScope.parent!!
        }
    }

    override fun visitAssignment(ctx: kernelParser.AssignmentContext?) {

    if (ctx?.WORD()?.size == 2)
    {
        if (!isCorrectType(ctx.WORD(0).text, ctx.WORD(1).text))
        {
            throw RuntimeException("Variable on right side of assignment" + " is of incorrect type!")
        }
    }
    else if (ctx?.methodCall() != null)
    {
        if (!isCorrectType(ctx.WORD(0).text, ctx.methodCall().WORD(0).text))
        {
            throw RuntimeException("Method on right side of assignment" +
                    " has incorrect return value!")
        }
    }

    super.visitAssignment(ctx)
}

    override fun visitFor(ctx: kernelParser.ForContext?): Any {
        val loopVar = ctx?.declaration()?.WORD(0)?.text
        val loopVarType = ctx?.declaration()?.TYPE()?.text!!

        currentScope = Scope(parent = currentScope, name = "for_loop")
        currentScope[loopVar!!] = Symbol(loopVar, TSType(loopVarType))

        return super.visitFor(ctx).also {
            currentScope = currentScope.parent!!
        }
    }

    override fun visitBlock(ctx: kernelParser.BlockContext?) {
        val name = ctx?.text

        currentScope = Scope(parent = currentScope, name = "block")

        super.visitBlock(ctx).also {
            currentScope = currentScope.parent!!
        }
    }

    override fun visitDeclaration(ctx: kernelParser.DeclarationContext?) {
        val isBuiltInType = typeSystem.getBuiltInTypes().contains(ctx?.TYPE()?.text)
        val type = ctx?.TYPE()?.text ?: ctx?.WORD(0)?.text
        val varName = if (isBuiltInType) ctx?.WORD(0)?.text else ctx?.WORD(1)?.text
        val rhs : String? = ctx?.WORD(2)?.text?: ctx?.REALNUMBER()?.text ?: ctx?.methodCall()?.text ?: ctx?.STRING()?.text ?: ctx?.expression()?.text ?: ctx?.WORD(1)?.text

        if (ctx?.WORD()?.size == 1 && isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), getType(rhs!!)))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (variable ${varName})")
            }
        }

        else if (ctx?.WORD()?.size == 2 && !isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), ctx?.methodCall()?.WORD(0)?.text!!))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (type ${getType(varName!!).type})")
            }
        }

        else if (ctx?.WORD()?.size == 2 && isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), getType(rhs!!)))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (type ${getType(rhs!!).type})")
            }
        }

        else if (ctx?.WORD()?.size == 3)
        {
            if (!isCorrectType(TSType(type!!), ctx?.WORD(2)?.text!!))
            {
                throw RuntimeException("Variable on right side of assignment" +
                        " to ${varName} is of incorrect type! (type ${getType(varName!!).type})")
            }
        }

        if (!StringUtils.isBlank(ctx?.MEMORY_QUALIFIER()?.text))
        {
            if (globalScope[varName!!] != null)
            {
                throw RuntimeException("Variable already defined!")
            }
        }
        currentScope[varName!!] = Symbol(varName, TSType(type!!))
        super.visitDeclaration(ctx)
    }

    override fun visitMethodCall(ctx: kernelParser.MethodCallContext?) {
        val methodName = ctx?.text!!
        val params = ctx?.WORD()?.subList(1, ctx.WORD()!!.size)!!

        params.forEach {
            if (!isInScope(it.text)) {
                throw RuntimeException("Variable ${it} not in scope when calling method ${methodName}!")
            }
        }

        if (isInScope(methodName)) {
            throw RuntimeException("No such method defined!")
        }

        super.visitMethodCall(ctx)
    }


    override fun visitBinaryOperator(ctx: kernelParser.BinaryOperatorContext?) {
        val rhs = ctx?.WORD(0)?.text ?: ctx?.REALNUMBER(0)?.text ?: ctx?.methodCall(0)?.WORD(0)?.text ?: ctx?.STRING(0)?.text
        val lhs = ctx?.WORD(1)?.text ?: ctx?.REALNUMBER(0)?.text ?: ctx?.methodCall(0)?.WORD(0)?.text ?: ctx?.STRING(0)?.text

        val typeRight = getType(rhs!!)?.type
        val typeLeft = getType(lhs!!)?.type

        if (typeLeft != typeRight) {
            throw RuntimeException("The types on the 2 sides of the expression are not the same!")
        }

        super.visitBinaryOperator(ctx)
    }

    fun isCorrectType(lhs: TSType, rhs: String): Boolean {
        return lhs.type == globalScope[rhs]?.type?.type ||
                globalScope[rhs]?.type?.parents?.contains(lhs)!!
    }

    fun isCorrectType(lhs: TSType, rhs: TSType): Boolean {
        return lhs.type == rhs.type || rhs.parents.contains(lhs)
    }

    fun isCorrectType(lhs: String, rhs: String): Boolean {

        val lhsType = getType(lhs);
        val rhsType = getType(rhs);

        return lhsType.type == rhsType.type || rhsType.parents.map { it.type }.contains(lhsType.type)
    }

    fun isInScope(variable: String): Boolean {
        var currScope : Scope? = currentScope
        while (currScope != null) {
            if (currScope.keys.contains(variable)) {
                return true
            }
            currScope = currScope.parent
        }
        return false
    }

    fun getType(variable: String): TSType {

        if (variable.toIntOrNull() != null) {
            return typeSystem.types["int"]!!
        } else if (variable.toFloatOrNull() != null) {
            return typeSystem.types["float"]!!
        } else if (variable.startsWith("\"")
            && variable.endsWith("\"")
            && variable.filter { it == '"' }.length == 2) {
            return typeSystem.types["string"]!!
        }

        var currScope : Scope? = currentScope;
        while (currScope != null) {
            if (currScope.keys.contains(variable)) {
                return currScope[variable]?.type!!
            }
            currScope = currScope.parent
        }
        throw RuntimeException("No type defined for variable ${variable}!")
    }

}