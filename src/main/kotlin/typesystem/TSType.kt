package typesystem

class TSType (
    val type: String,
    val isArray: Boolean = false
) {
    var parents: MutableSet<TSType> = mutableSetOf()

}