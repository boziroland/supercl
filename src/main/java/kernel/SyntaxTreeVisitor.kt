package kernel

import kernel.antlr.kernelBaseVisitor
import kernel.antlr.kernelParser
import symboltable.Scope
import syntaxtree.ClassNode
import syntaxtree.DeclarationNode
import syntaxtree.ExpressionNode
import syntaxtree.ForNode
import syntaxtree.IfNode
import syntaxtree.MethodCallNode
import syntaxtree.MethodNode
import syntaxtree.ProgramNode
import syntaxtree.SyntaxTreeNode
import syntaxtree.WhileNode

class SyntaxTreeVisitor(private var globalScope: Scope) : kernelBaseVisitor<Any>() {

    private val syntaxTree: MutableList<SyntaxTreeNode> = mutableListOf(ProgramNode())
    private val kernels: MutableList<MethodNode> = mutableListOf()
    private val classes = mutableListOf<ClassNode>()
    private var tabCounter = 0

    override fun visitExpression(ctx: kernelParser.ExpressionContext?) {
        syntaxTree.add(ExpressionNode(syntaxTree.last(), ctx))
    }

    override fun visitIf(ctx: kernelParser.IfContext?) {
        val ifNode = IfNode(syntaxTree.last(), kernels, ctx!!, tabCounter)
        syntaxTree.add(ifNode)
    }

    override fun visitFor(ctx: kernelParser.ForContext?) {
        val forNode = ForNode(syntaxTree.last(), ctx!!, kernels, tabCounter)
        syntaxTree.add(forNode)
    }

    override fun visitWhile(ctx: kernelParser.WhileContext?) {
        val whileNode = WhileNode(syntaxTree.last(), ctx!!, kernels, tabCounter)
        syntaxTree.add(whileNode)
    }

    override fun visitMethod(ctx: kernelParser.MethodContext?) {
        val methodHeader = ctx?.methodHeader()!!
        val methodBody = ctx.methodBody()!!
        val isKernel = methodHeader.KERNEL()?.text != null
        val methodNode =
            MethodNode(syntaxTree.last(), kernels, methodHeader, methodBody, tabCounter, isKernel)

        if (isKernel)
            kernels.add(methodNode)
        else
            syntaxTree.add(methodNode)
    }

    override fun visitClass(ctx: kernelParser.ClassContext?) {
        val classNode = ClassNode(
            syntaxTree.last(),
            ctx!!,
            kernels,
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

    override fun visitDeclaration(ctx: kernelParser.DeclarationContext?) {
        syntaxTree.add(DeclarationNode(syntaxTree.last(), ctx!!, tabCounter))
    }

    override fun visitMethodCall(ctx: kernelParser.MethodCallContext?) {
        syntaxTree.add(MethodCallNode(syntaxTree.last(), kernels, ctx))
    }

    fun generateCode(): List<String> {
        return listOf(
            syntaxTree.joinToString(transform = { it.toCode() }, separator = ""),
            kernels.joinToString(transform = { it.toCode() }, separator = "")
        )

    }
}
