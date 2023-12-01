package syntaxtree

import kernel.antlr.kernelParser

class ReturnExpressionNode (
    parent: SyntaxTreeNode?,
    private val returnExpressionCtx: kernelParser.ReturnExpressionContext,
    private var tabCounter: Int)
    : SyntaxTreeNode(parent)
{
    override fun toCode(): String {
        TODO("Not yet implemented")
    }
}
