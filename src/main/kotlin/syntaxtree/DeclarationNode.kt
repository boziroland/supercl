package syntaxtree

import kernel.antlr.kernelParser

class DeclarationNode (
    parent: SyntaxTreeNode?,
    private val declarationCtx: kernelParser.DeclarationContext,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""
        ret += declarationCtx.MEMORY_QUALIFIER()?.text ?: ""
        ret += if (ret.isBlank()) "" else " "
        ret += declarationCtx.typeName().TYPE()?.text ?: declarationCtx.typeName().WORD().text
        ret += " "
        ret += declarationCtx.variable(0).text
        ret += " "
        ret += declarationCtx.ASSIGN()?.text ?: ""
        ret += " "
        ret += declarationCtx.cast()?.text ?: ""
        when {
            declarationCtx.WORD() != null -> ret += declarationCtx.WORD().text
            declarationCtx.REALNUMBER() != null -> ret += declarationCtx.REALNUMBER()
            declarationCtx.methodCall() != null -> ret += declarationCtx.methodCall().text // TODO potentially
            declarationCtx.STRING() != null -> ret += declarationCtx.STRING()
            declarationCtx.expression() != null -> ret += ExpressionNode(this, declarationCtx.expression()).toCode()
            else -> ret += declarationCtx.variable(1).text
        }
        ret += ";\n"
        return ret
    }

}
