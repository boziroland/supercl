package syntaxtree

import kernel.antlr.kernelParser

class WhileNode(
    parent: SyntaxTreeNode?,
    private val whileContext: kernelParser.WhileContext,
    private val kernels: MutableList<MethodNode>?,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        val expression = ExpressionNode(this, whileContext.expression())
        val statements = StatementListNode(this, whileContext.block().statementList(), kernels, tabCounter)
        val ret =
        "while (${expression.toCode()}) {\n" +
        "${statements.toCode()}" +
        " ".repeat((tabCounter - 1) * 4) +
            "}\n"
        return ret
    }

}