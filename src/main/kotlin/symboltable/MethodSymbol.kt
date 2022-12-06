package symboltable

import typesystem.TSType

class MethodSymbol(name: String, type: TSType) : Symbol(name, type)  {

    val parameters: HashMap<String, TSType> = hashMapOf()

}
