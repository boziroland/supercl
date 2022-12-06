package typesystem

class TSType (
    val type: String
) {
    var parents: MutableSet<TSType> = mutableSetOf()

}