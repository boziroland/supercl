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

        ret += "}\n"

        return ret
    }

}