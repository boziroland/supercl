package syntaxtree

abstract class SyntaxTreeNode(
    val parent: SyntaxTreeNode? = null,
    val children: List<SyntaxTreeNode>? = null
) {
    abstract fun toCode(): String
}