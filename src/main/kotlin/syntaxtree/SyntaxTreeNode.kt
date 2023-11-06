package syntaxtree

abstract class SyntaxTreeNode (
        val parent: SyntaxTreeNode? = null
        ){

        abstract fun toCode(): String

}