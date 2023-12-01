package syntaxtree

import kernel.antlr.kernelParser
import org.stringtemplate.v4.ST

class ParameterNode(
    parent: SyntaxTreeNode?,
    private val parameterCtx: kernelParser.ParameterContext
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        val ret = ST("<memoryQualifier> <type> <variableName>")
        ret.add("memoryQualifier", parameterCtx.MEMORY_QUALIFIER()?.text ?: "")
        ret.add("type", parameterCtx.typeName().text)
        ret.add("variableName", parameterCtx.WORD().text)

        return ret.render()
    }

}