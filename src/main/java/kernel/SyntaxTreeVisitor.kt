package kernel

import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import symboltable.Scope
import syntaxtree.ClassNode
import syntaxtree.ExpressionNode
import syntaxtree.ForNode
import syntaxtree.IfNode
import syntaxtree.MethodNode
import syntaxtree.ProgramNode
import syntaxtree.StatementListNode
import syntaxtree.SyntaxTreeNode
import syntaxtree.WhileNode

class SyntaxTreeVisitor(private var globalScope: Scope) : kernelBaseVisitor<Any>() {

    private val syntaxTree: MutableList<SyntaxTreeNode> = mutableListOf(ProgramNode())
    private val classes = mutableListOf<ClassNode>()
    private var tabCounter = 0

//    override fun visitStatementList(ctx: kernelParser.StatementListContext?) {
//        syntaxTree.add(StatementListNode(syntaxTree.last(), ctx!!, tabCounter))
//    }

    override fun visitExpression(ctx: kernelParser.ExpressionContext?): Any {
        syntaxTree.add(ExpressionNode(syntaxTree.last(), ctx))

        return super.visitExpression(ctx)
    }

    override fun visitIf(ctx: kernelParser.IfContext?) {
        val ifNode = IfNode(syntaxTree.last(), ctx!!, tabCounter)
        syntaxTree.add(ifNode)
    }

    override fun visitFor(ctx: kernelParser.ForContext?) {
        val forNode = ForNode(syntaxTree.last(), ctx!!, tabCounter)
        syntaxTree.add(forNode)
    }

    override fun visitWhile(ctx: kernelParser.WhileContext?) {
        val whileNode = WhileNode(syntaxTree.last(), ctx!!, tabCounter)
        syntaxTree.add(whileNode)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext?) {
        val methodHeader = ctx?.methodHeader()!!
        val methodBody = ctx.methodBody()!!

        val methodNode = MethodNode(syntaxTree.last(), methodHeader, methodBody, tabCounter)
        syntaxTree.add(methodNode)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) {
        val classNode = ClassNode(
            syntaxTree.last(),
            ctx!!,
            if (ctx.className().size > 1)
                classes.filter { it.classContext.className(0).text == ctx.className(1).text }[0]
            else
                null,
            globalScope,
            tabCounter
        )
        classes.add(classNode)
        syntaxTree.add(classNode)
    }

    fun generateCode(): String {
        return syntaxTree.joinToString(transform = { it.toCode() }, separator = "")
    }
}
