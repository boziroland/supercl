package symboltable

import typesystem.TSType

open class Symbol(
    val name: String,
    val type: TSType
) {
    override fun toString() = "$name: $type"
}