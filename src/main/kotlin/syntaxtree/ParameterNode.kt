package syntaxtree

import kernel.antlr.kernelParser

class ParameterNode(
    parent: SyntaxTreeNode?,
    private val parameterCtx: kernelParser.ParameterContext
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""

        ret += parameterCtx.MEMORY_QUALIFIER()?.text ?: ""
        ret += " "
        ret += parameterCtx.typeName().text
        ret += " "
        ret += parameterCtx.WORD().text

        return ret
    }

}