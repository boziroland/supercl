package typesystem

class TypeSystem {

    var types: HashMap<String, TSType> = hashMapOf(
        Pair("int", TSType("int")),
        Pair("bool", TSType("bool")),
        Pair("float", TSType("float")),
        Pair("string", TSType("string")),
        Pair("ErrorType", TSType("ErrorType")),
        Pair("NullType", TSType("NullType"))
    )

    init {
        types["NullType"]?.parents?.add(types["string"]!!)
        types["ErrorType"]?.parents?.add(types["int"]!!)
        types["ErrorType"]?.parents?.add(types["bool"]!!)
        types["ErrorType"]?.parents?.add(types["float"]!!)
        types["ErrorType"]?.parents?.add(types["NullType"]!!)
    }

    fun addType(type: TSType): Boolean {
        if (types.containsKey(type.type)) {
            return false
        }

        types[type.type] = type
        types["NullType"]?.parents?.add(type)

        return true
    }

    fun getBuiltInTypes(): Set<String> { return setOf("int", "bool", "float", "string")}

}