package syntaxtree

import kernel.antlr.kernelParser.IfContext

class IfNode(
    parent: SyntaxTreeNode?,
    private val ifContext: IfContext,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""

        val expression = ExpressionNode(this, ifContext.expression())
        ret += "if ("
        ret += expression.toCode()
        ret += ")"
        ret += " {\n"
        val statements = StatementListNode(this, ifContext.block().statementList(), tabCounter)
        ret += statements.toCode()
        ret += " ".repeat((tabCounter - 1) * 4)
        ret += "}"

        ret += if (ifContext.else_().isEmpty()) "\n" else ""

        ifContext.else_().forEach {
            ret += " else "
            if (it.if_() != null) {
                ret += IfNode(this, it.if_(), tabCounter).toCode()
            } else {
                ret += "{\n"
                ret += StatementListNode(this, it.block().statementList(), tabCounter).toCode()
                ret += " ".repeat((tabCounter - 1) * 4) + "}\n"
            }
        }
        return ret
    }
}