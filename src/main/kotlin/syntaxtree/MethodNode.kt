package syntaxtree

import kernel.antlr.kernelParser

class MethodNode(
    parent: SyntaxTreeNode?,
    private val kernels: MutableList<MethodNode>?,
    val methodHeaderCtx: kernelParser.MethodHeaderContext,
    private val methodBodyCtx: kernelParser.MethodBodyContext,
    private var tabCounter: Int,
    private val isKernel: Boolean
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""
        val methodReturnValue = methodHeaderCtx.typeName()?.text ?: (methodHeaderCtx.KERNEL().text + " void")
        ret += methodReturnValue
        ret += " "
        ret += methodHeaderCtx.WORD().text
        ret += " ("
        var params = ""
        for (param in methodHeaderCtx.parameter()) {
            params += ParameterNode(this, param, isKernel).toCode() + ","
        }
        if (params.isNotBlank()) {
            ret += params.substring(0, params.length - 1)
        }
        ret += ") "

        val statements = MethodBodyNode(this, methodBodyCtx, kernels, tabCounter)
        ret += statements.toCode()

        return ret
    }

}