package syntaxtree

import kernel.antlr.kernelParser

class ExpressionNode(
    parent: SyntaxTreeNode?,
    private val expression: kernelParser.ExpressionContext?,
    private val kernels: MutableList<MethodNode>? = null,
) : SyntaxTreeNode(parent) {


    override fun toCode(): String {
        var ret = ""
        if (expression?.prefixOperator() != null) {
            ret +=
                if (expression.prefixOperator().PLUSPLUS() != null) "++" else "--" + expression.prefixOperator()
                    .variable().text!!
        } else if (expression?.postfixOperator() != null) {
            ret += expression.postfixOperator().variable().text!! + if (expression.postfixOperator()
                    .PLUSPLUS() != null
            ) "++" else "--"
        } else if (expression?.binaryOperator() != null) {
            ret += expression.binaryOperator().text!!
        } else if (expression?.literal()?.TRUE() != null) {
            ret += "true"
        } else if (expression?.literal()?.FALSE() != null) {
            ret += "false"
        } else if (expression?.literal()?.REALNUMBER() != null) {
            ret += expression.literal()?.REALNUMBER()
        } else if (expression?.literal()?.methodCall() != null) {
            ret += MethodCallNode(this, kernels, expression.literal().methodCall()).toCode()
        }

        expression?.expression()!!.forEachIndexed { index, expr ->
            ret += " "
            ret += expression.CONNECTIVE(index).text
            ret += " "
            ret += ExpressionNode(this, expr).toCode()
        }

        return ret
    }


}