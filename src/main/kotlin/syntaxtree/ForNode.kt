package syntaxtree

import kernel.antlr.kernelParser.ForContext
import org.stringtemplate.v4.ST

class ForNode(
    parent: SyntaxTreeNode?,
    private val forContext: ForContext,
    private var tabCounter: Int
) : SyntaxTreeNode(parent) {


    override fun toCode(): String {
        val loopVarType = forContext.declaration()?.typeName()?.text!!
        val loopVar = forContext.declaration()?.variable()?.text!!
        val loopStart = forContext.declaration()?.children?.get(3)?.text!! // ugly ugly super ugly
        val loopEnd = ExpressionNode(this, forContext.expression(0)) // only single end condition TODO
        val loopIncrement = forContext.expression(1)?.children?.last()?.text!!
        val statements = StatementListNode(this, forContext.block().statementList(), tabCounter)

        val code = ST("for (<loopVarType> <loopVar> = <loopStart>; <loopEnd>; <loopIncrement>) " +
                "{\n" +
                    "<statements>" +
                " ".repeat((tabCounter - 1) * 4) + "}\n")
        code.add("loopVarType", loopVarType)
        code.add("loopVar", loopVar)
        code.add("loopStart", loopStart)
        code.add("loopEnd", loopEnd.toCode())
        code.add("loopIncrement", loopIncrement)
        code.add("statements", statements.toCode())
        return code.render()
    }

}