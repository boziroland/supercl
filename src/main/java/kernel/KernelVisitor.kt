package kernel

import org.apache.commons.lang3.StringUtils
import symboltable.Scope
import symboltable.Symbol

class KernelVisitor : kernelBaseVisitor<Any>() {

    val globalScope = Scope(parent = null, name = "GLOBAL")
    private var currentScope: Scope = globalScope

    /* entry point */
    override fun visitProgram(ctx: kernelParser.ProgramContext?): Any {
        currentScope = globalScope
        return super.visitProgram(ctx)
    }

    override fun visitStatementList(ctx: kernelParser.StatementListContext?): Any {
        return super.visitStatementList(ctx)
    }

    override fun visitStatement(ctx: kernelParser.StatementContext?): Any {
        return super.visitStatement(ctx)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?): Any { // dataclass
        val name = ctx?.text
        val vars = ctx?.WORD()

        currentScope = Scope(parent = currentScope, name = name!!)
        vars!!.forEach { e -> currentScope[name] = Symbol(e.text) }

        return super.visitClass(ctx)
    }

    override fun visitParameter(ctx: kernelParser.ParameterContext?): Any {
        val name = ctx?.WORD()?.text

        currentScope = Scope(parent = currentScope, name = name!!)
        currentScope[name] = Symbol(name)

        return super.visitParameter(ctx)
    }

    override fun visitMethodHeader(ctx: kernelParser.MethodHeaderContext?): Any {
        val name = ctx?.text

        return super.visitMethodHeader(ctx)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext?): Any {
        val methodName = ctx?.methodHeader()?.WORD()?.text;
        val assignments = ctx?.block()?.assignment()

        currentScope = Scope(parent = currentScope, name = methodName!!)

        assignments?.forEach { a ->
            run {
                val varName = a.WORD(0).text
                currentScope[varName] = Symbol(varName)
            }
        }

        return super.visitMethod(ctx)
    }


    override fun visitFor(ctx: kernelParser.ForContext?): Any {
        val assignment = ctx?.block()?.assignment()
        val loopVar = assignment?.get(0)?.WORD(0)?.text

        currentScope = Scope(parent = currentScope, name = "for_loop")
        currentScope[loopVar!!] = Symbol(loopVar)

        return super.visitFor(ctx)
    }

    override fun visitWhile(ctx: kernelParser.WhileContext?): Any {
        val name = ctx?.text

        return super.visitWhile(ctx)
    }

    override fun visitIf(ctx: kernelParser.IfContext?): Any {
        val name = ctx?.text

        return super.visitIf(ctx)
    }

    override fun visitBlock(ctx: kernelParser.BlockContext?): Any {
        val name = ctx?.text

        currentScope = Scope(parent = currentScope, name = "block")

        return super.visitBlock(ctx)
    }

    override fun visitAssignment(ctx: kernelParser.AssignmentContext?): Any {
        val varName = ctx?.WORD(0)?.text

        if (!StringUtils.isBlank(ctx?.MEMORY_QUALIFIER()?.text))
        {
            if (currentScope[varName!!] != null)
            {
                throw RuntimeException("Variable already defined!")
            }
        }
        currentScope[varName!!] = Symbol(varName)

        return super.visitAssignment(ctx)
    }

    override fun visitSingleLineComment(ctx: kernelParser.SingleLineCommentContext?): Any {
        val name = ctx?.text

        return super.visitSingleLineComment(ctx)
    }

    override fun visitMultiLineComment(ctx: kernelParser.MultiLineCommentContext?): Any {
        val name = ctx?.text

        return super.visitMultiLineComment(ctx)
    }

    override fun visitMethodCall(ctx: kernelParser.MethodCallContext?): Any {
        val name = ctx?.text

        return super.visitMethodCall(ctx)
    }

    override fun visitExpression(ctx: kernelParser.ExpressionContext?): Any {
        val name = ctx?.text

        return super.visitExpression(ctx)
    }

    override fun visitPrefixOperator(ctx: kernelParser.PrefixOperatorContext?): Any {
        val name = ctx?.text

        return super.visitPrefixOperator(ctx)
    }

    override fun visitPostfixOperator(ctx: kernelParser.PostfixOperatorContext?): Any {
        val name = ctx?.text

        return super.visitPostfixOperator(ctx)
    }

    override fun visitBinaryOperator(ctx: kernelParser.BinaryOperatorContext?): Any {
        val name = ctx?.text

        return super.visitBinaryOperator(ctx)
    }

}