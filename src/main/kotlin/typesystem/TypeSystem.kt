package typesystem

class TypeSystem {

    var types: HashMap<String, TSType> = hashMapOf(
        Pair("int", TSType("int")),
        Pair("bool", TSType("bool")),
        Pair("float", TSType("float")),
        Pair("int2", TSType("int2")),
        Pair("int3", TSType("int3")),
        Pair("float2", TSType("float2")),
        Pair("float3", TSType("float3")),
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
        types["ErrorType"]?.parents?.add(type)

        return true
    }

    fun isParent(type: String, possibleParent: String): Boolean {
        return types[type]?.parents?.map { it.type }?.contains(possibleParent) ?: false
    }

    fun getBuiltInTypes(): Set<String> { return setOf("int", "bool", "float", "string")}

}