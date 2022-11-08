package symboltable

open class Symbol(
    val name: String,
    val type: String
) {

    constructor(
        name: String
    ) : this(name = name, type = "var")

    override fun toString() = "$name: $type"
}