package syntaxtree

class ProgramNode(parent: SyntaxTreeNode? = null) : SyntaxTreeNode(parent) {

    override fun toCode(): String {
        return ""
    }
}