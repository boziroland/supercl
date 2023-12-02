package syntaxtree

import kernel.antlr.kernelParser

class ReturnExpressionNode (
    parent: SyntaxTreeNode?,
    private val returnExpressionCtx: kernelParser.ReturnExpressionContext,
    private var tabCounter: Int
    )
    : SyntaxTreeNode(parent)
{
    override fun toCode(): String {
        var ret = "return "

        ret += ExpressionNode(this, returnExpressionCtx.expression()).toCode()
        ret += ";\n"

        return ret;
    }
}
