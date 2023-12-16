package syntaxtree

import kernel.antlr.kernelParser
import org.stringtemplate.v4.ST

class ParameterNode(
    parent: SyntaxTreeNode?,
    private val parameterCtx: kernelParser.ParameterContext,
    private val isKernel: Boolean
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        val ret = ST("<memoryQualifier> <type><pointer> <variableName>")
        ret.add("memoryQualifier", parameterCtx.MEMORY_QUALIFIER()?.text ?: "")
        ret.add("type", parameterCtx.typeName().text)
        ret.add("pointer", if (isKernel) "*" else "")
        ret.add("variableName", parameterCtx.WORD().text)

        return ret.render()
    }

}