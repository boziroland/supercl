package typesystem

class TSType (
    val type: String
) {
    var parents: MutableSet<TSType> = mutableSetOf()

    init {
        if (!TypeSystem.types.containsKey(type)) {
            TypeSystem.types["type"];
            TypeSystem.types["NullType"]!!.parents.add(this)
        }
    }

}