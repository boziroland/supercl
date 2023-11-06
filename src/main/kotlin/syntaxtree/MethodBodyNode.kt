package syntaxtree

import kernel.antlr.kernelParser

class MethodBodyNode(
    parent: SyntaxTreeNode?,
    private val methodBodyCtx: kernelParser.MethodBodyContext,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""

        ret += "{\n"
        val statements = StatementListNode(this, methodBodyCtx.statementList(), tabCounter + 1)
        ret += statements.toCode()

        val returnValue =
            methodBodyCtx.expressionWithReturnValue()?.variable()?.text
                ?: methodBodyCtx.expressionWithReturnValue()?.methodCall()?.text // TODO nicer, pointers
                ?: methodBodyCtx.expressionWithReturnValue()?.WORD()?.text
                ?: methodBodyCtx.expressionWithReturnValue()?.REALNUMBER()?.text
                ?: methodBodyCtx.expressionWithReturnValue()?.STRING()?.text
                ?: ""

        if (returnValue.isNotBlank()) {
            ret += " ".repeat((tabCounter + 1) * 4) + "return $returnValue\n"
        }

        ret += "}\n"

        return ret
    }

}