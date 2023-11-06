package syntaxtree

import kernel.antlr.kernelParser

class AssignmentNode(
    parent: SyntaxTreeNode?,
    private val assignment: kernelParser.AssignmentContext
) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        var ret = ""
        val variable = assignment.variable(0)
        ret += variable.text
        ret += if (assignment.ASSIGN() != null) "=" else assignment.specialAssign().text
        ret += if (assignment.cast() != null) assignment.cast().text else ""
        ret += when {
            assignment.WORD() != null -> assignment.WORD().text
            assignment.REALNUMBER() != null -> assignment.REALNUMBER()
            assignment.methodCall() != null -> assignment.methodCall().text // TODO potentially
            assignment.STRING() != null -> assignment.STRING()
            assignment.expression() != null -> ExpressionNode(this, assignment.expression()).toCode()
            else -> assignment.variable(1).text
        }
        ret += ";\n"
        return ret
    }

}
