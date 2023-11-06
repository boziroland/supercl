package syntaxtree

import kernel.antlr.kernelParser

class ExpressionNode(
    parent: SyntaxTreeNode?,
    private val expression: kernelParser.ExpressionContext?
) : SyntaxTreeNode(parent) {


    override fun toCode(): String {
        var ret = ""
        if (expression?.prefixOperator() != null) {
            ret =
                if (expression.prefixOperator().PLUSPLUS() != null) "++" else "--" + expression.prefixOperator()
                    .variable().text!!
        } else if (expression?.postfixOperator() != null) {
            ret = expression.postfixOperator().variable().text!! + if (expression.postfixOperator()
                    .PLUSPLUS() != null
            ) "++" else "--"
        } else if (expression?.binaryOperator() != null) {
            ret = expression.binaryOperator().text!! // TODO
        } else if (expression?.TRUE() != null) {
            ret = "true"
        }

        expression?.expression()!!.forEachIndexed { index, expr ->
            ret += " "
            ret += expression.andandoror(index).text
            ret += " "
            ret += ExpressionNode(this, expr).toCode()
        }

        return ret
    }


}