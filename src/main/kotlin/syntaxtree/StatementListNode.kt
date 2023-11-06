package syntaxtree

import kernel.antlr.kernelParser

class StatementListNode(
    parent: SyntaxTreeNode?,
    private val statements: kernelParser.StatementListContext,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""
        for (statement in statements.statement()) {
            if (statement.if_() != null) {
                ret += " ".repeat(tabCounter * 4) + IfNode(this, statement.if_(), tabCounter + 1).toCode()
            } else if (statement.for_() != null) {
                ret += " ".repeat(tabCounter * 4) + ForNode(this, statement.for_(), tabCounter + 1).toCode()
            } else if (statement.assignment() != null) {
                ret += " ".repeat(tabCounter * 4) + AssignmentNode(this, statement.assignment()).toCode()
            } else if (statement.while_() != null) {
                ret += " ".repeat(tabCounter * 4) + WhileNode(this, statement.while_(), tabCounter + 1).toCode()
            } else if (statement.declaration() != null) {
                ret += " ".repeat(tabCounter * 4) + DeclarationNode(this, statement.declaration(), tabCounter).toCode()
            }
        }
        return ret
    }

}