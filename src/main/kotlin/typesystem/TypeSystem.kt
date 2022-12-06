package typesystem

object TypeSystem {

    var types: HashMap<String, TSType> = hashMapOf(
        Pair("int", TSType("int")),
        Pair("bool", TSType("bool")),
        Pair("float", TSType("float")),
        Pair("string", TSType("string")),
        Pair("ErrorType", TSType("ErrorType")),
        Pair("NullType", TSType("NullType"))
    )

}