package kernel

import Errors
import MyError
import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import org.antlr.v4.runtime.ParserRuleContext
import org.apache.commons.lang3.StringUtils
import symboltable.Scope
import symboltable.Symbol
import typesystem.ExpressionTypeChecker
import typesystem.TSType
import typesystem.TypeSystem

class DetailedVisitor : kernelBaseVisitor<Any>() {

    lateinit var globalScope: Scope
    lateinit var typeSystem: TypeSystem
    lateinit var currentScope: Scope
    lateinit var expressionTypeChecker: ExpressionTypeChecker

    private val errors = Errors()

    override fun visitProgram(ctx: kernelParser.ProgramContext?) {

        currentScope = globalScope

        super.visitProgram(ctx)

        print(errors.getErrors())
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) {
        val name = ctx?.className(0)!!.text
        val vars = ctx.WORD()
        val methods = ctx.method()
        val parent = if (ctx.EXTENDS() != null) ctx.className(1)!!.text else "-"

        currentScope = Scope(parent = currentScope, name = name!!)
        vars!!.forEach { e -> currentScope[name] = Symbol(e.text, TSType(name)) }
        methods!!.forEach { m -> currentScope[name] = Symbol(m.text, TSType(m.methodHeader().typeName().text?: "void")) }

        super.visitClass(ctx).also {
            currentScope = currentScope.parent!!
        }
    }

    override fun visitParameter(ctx: kernelParser.ParameterContext?) {
        val type = ctx?.typeName()?.text!!
        val name = ctx?.WORD()?.text

        currentScope = Scope(parent = currentScope, name = name!!)
        currentScope[name] = Symbol(name, TSType(type))

        super.visitParameter(ctx)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext?) {
        val methodName = ctx?.methodHeader()?.WORD()?.text!!
        val retType = ctx.methodHeader().typeName()?.text ?: ctx?.methodHeader()?.KERNEL()?.text!!
        val retVal = ctx.methodBody().expressionWithReturnValue()?.text
        val assignments = ctx.methodBody()?.statementList()?.statement()?.filter { a -> a.assignment() != null }

        if (!isInScope(methodName)) {
            errors.add(MyError("No such method defined!", ctx.start.line, ctx.start.charPositionInLine))
        }

        assignments?.forEach { a ->
            run {
                val varName = a.assignment().variable(0).text
                currentScope[varName] = Symbol(varName, TSType(retType))
            }
        }

        if (retVal != null) {
            if (retType != expressionTypeChecker.getType(currentScope, retVal).type) {
                errors.add(MyError("Incorrect return type!", ctx.start.line, ctx.start.charPositionInLine))
            }
        }

        currentScope = Scope(parent = currentScope)

        super.visitMethod(ctx).also {
            if (currentScope.parent != null) {
                currentScope = currentScope.parent!!
            }
        }
    }

    override fun visitAssignment(ctx: kernelParser.AssignmentContext?) {

    if (ctx?.variable()?.size == 2)
    {
        if (!isCorrectType(ctx?.variable(0)?.text!!, ctx?.variable(0)?.text!!))
        {
            errors.add(MyError("Variable on right side of assignment is of incorrect type!", ctx.start.line, ctx.start.charPositionInLine))
        }
    }
    else if (ctx?.methodCall() != null) {
        if (!isCorrectType(ctx.variable()[0].text!!, ctx?.variable(0)?.text!!)) {
            errors.add(
                MyError(
                    "Method on right side of assignment has incorrect return value!",
                    ctx.start.line,
                    ctx.start.charPositionInLine
                )
            )
        }
    }
    else if (ctx?.expression() != null) {
        if (!isCorrectType(ctx.variable()[0].text!!, (ctx.expression()!!.children[0] as ParserRuleContext).children[0].text)) {
            errors.add(
                MyError(
                    "Expression on right side of assignment has incorrect type!",
                    ctx.start.line,
                    ctx.start.charPositionInLine
                )
            )
        }
    }

    super.visitAssignment(ctx)
}

    override fun visitFor(ctx: kernelParser.ForContext?): Any {
        val loopVar = ctx?.declaration()?.variable(0)?.text
        val loopVarType = ctx?.declaration()?.typeName()?.text!!

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
        val isBuiltInType = typeSystem.getBuiltInTypes().contains(ctx?.typeName()?.text)
        val cast = (ctx?.cast() != null)
        var type = ctx?.typeName()?.text ?: ctx?.variable(0)?.text
        val varName = ctx?.variable(0)?.text
        var rhs : String? = ctx?.expression()?.text ?: ctx?.variable(1)?.text?: ctx?.REALNUMBER()?.text ?: ctx?.methodCall()?.text ?: ctx?.STRING()?.text ?: ctx?.WORD()?.text
        val rhsType = getType(rhs!!).type
        if (cast) {
            if (expressionTypeChecker.isClass(rhsType)) {
                currentScope[varName!!] = Symbol(varName, TSType(rhsType))
            } else {
                rhs = expressionTypeChecker.valueConverter(rhs, ctx?.cast()?.text!!, rhsType)
            }
        }

        if (type == "var")
        {
            type = getType(rhs!!).type
        }

        if (ctx?.expression() != null) {
            currentScope[rhs!!] = Symbol(rhs, TSType(type!!))
        }

        if (isBuiltInType)
        {
            if (ctx?.expression()?.binaryOperator() != null)
            {
                visitBinaryOperator(ctx.expression().binaryOperator())
            }
        }

        else if (/*ctx?.WORD()?.size == 2 && */!isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), ctx?.methodCall()?.WORD(0)?.text!!))
            {
                errors.add(MyError("Variable on right side of assignment to ${varName} is of incorrect type! (type ${getType(varName!!).type})", ctx.start.line, ctx.start.charPositionInLine))
            }
        }

        else if (/*ctx?.WORD()?.size == 2 && */isBuiltInType)
        {
            if (!isCorrectType(TSType(type!!), getType(rhs!!)))
            {
                errors.add(MyError("Variable on right side of assignment to ${varName} is of incorrect type! (type ${getType(varName!!).type})", ctx.start.line, ctx.start.charPositionInLine))
            }
        }

        if (!StringUtils.isBlank(ctx?.MEMORY_QUALIFIER()?.text))
        {
            if (globalScope[varName!!] != null)
            {
                if (ctx != null) { // TODO
                    errors.add(MyError("Variable already defined!", ctx.start.line, ctx.start.charPositionInLine))
                }
            }
        }
        currentScope[varName!!] = Symbol(varName, TSType(type!!))
        super.visitDeclaration(ctx)
    }

    override fun visitMethodCall(ctx: kernelParser.MethodCallContext?) {
        val methodName = ctx?.text!!
        val params = ctx.children.subList(2, ctx.children.size).filterIndexed { i, _ -> i % 2 == 0 }
        params.forEach {
            if (!isInScope(it.text)) {
                errors.add(MyError("Variable ${it.text} not in scope when calling method ${methodName}!", ctx.start.line, ctx.start.charPositionInLine))
            }
        }

        if (!isInScope(methodName)) {
            errors.add(MyError("No such method defined!", ctx.start.line, ctx.start.charPositionInLine))
        }

        super.visitMethodCall(ctx)
    }


    override fun visitBinaryOperator(ctx: kernelParser.BinaryOperatorContext?) {
        val rhs = ctx?.children?.get(0)?.text
        val lhs = ctx?.children?.get(2)?.text

        try {
            expressionTypeChecker.getReturnType(currentScope, rhs, lhs)
        } catch (e: RuntimeException) {
            errors.add(MyError(e.localizedMessage, ctx?.start?.line!!, ctx.start?.charPositionInLine!!))
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
        if ((variable.startsWith("\"") && variable.endsWith("\"")) || variable.toDoubleOrNull() != null) {
            return true
        }

        var currScope : Scope? = currentScope
        var lastDot = variable.lastIndexOf('.')
//        var actualVariable = if (lastDot == -1) variable else variable.substring(lastDot + 1)
//        var mainVariable = if (lastDot == -1) variable else variable.substring(0, lastDot)
        val varsInChain = variable.split(".")
        while (currScope != null) {
            varsInChain.forEachIndexed { i, _ ->
                if (currScope!!.keys.contains(varsInChain[i])) {
                    currScope = currScope!!.parent
                }
            }
            return true
            currScope = currScope!!.parent
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
        throw RuntimeException("Either no type defined for variable ${variable} or it could not be deduced!")
    }

    fun getNonPrivateParentMethods() {

    }

}