package symboltable

import typesystem.TSType

class ClassSymbol(
    name: String,
    val parent: String?
) : Symbol(name, TSType(name)) {
    val properties: HashMap<String, TSType> = hashMapOf()
    val methods: HashMap<String, TSType> = hashMapOf()
}