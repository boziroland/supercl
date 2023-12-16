package syntaxtree

import kernel.antlr.kernelParser

class DeclarationNode (
    parent: SyntaxTreeNode?,
    private val declarationCtx: kernelParser.DeclarationContext,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""
        val isArray = declarationCtx.typeName()?.LEFTBRACKET() != null

        ret += declarationCtx.MEMORY_QUALIFIER()?.text ?: ""
        ret += if (ret.isBlank()) "" else " "
        ret += if (isArray) "std::vector<" else ""
        ret += declarationCtx.typeName().TYPE()?.text ?: declarationCtx.typeName().WORD().text
        ret += if (isArray) ">" else ""
        ret += " "
        ret += declarationCtx.variable().text
        ret += " "
        ret += if (isArray) ("(" + declarationCtx.typeName().REALNUMBER().text + ")") else (declarationCtx.ASSIGN()?.text ?: "")
        ret += " "
        ret += declarationCtx.cast()?.text ?: ""
        try {
            when {
                declarationCtx.expression().literal()?.WORD() != null -> ret += declarationCtx.expression().literal()
                    .WORD().text
                declarationCtx.expression().literal()?.REALNUMBER() != null -> ret += declarationCtx.expression()
                    .literal().REALNUMBER()
                declarationCtx.expression().literal()?.methodCall() != null -> ret += declarationCtx.expression()
                    .literal().methodCall().text // TODO potentially
                declarationCtx.expression().literal()?.STRING() != null -> ret += declarationCtx.expression().literal()
                    .STRING()
                declarationCtx.expression() != null -> ret += ExpressionNode(this, declarationCtx.expression()).toCode()
                else -> ret += declarationCtx.expression().literal().variable().text
            }
        } catch (e: NullPointerException) {
            // nothing to see here
        }
        ret += ";\n"
        return ret
    }

}
