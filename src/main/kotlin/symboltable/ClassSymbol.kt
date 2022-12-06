package symboltable

import typesystem.TSType

class ClassSymbol(name: String) : Symbol(name, TSType(name)) {

    val properties: HashMap<String, TSType> = hashMapOf()
}