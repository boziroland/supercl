package symboltable

import typesystem.MethodParameter
import typesystem.TSType

class MethodSymbol(
    val memoryQualifier: String,
    name: String,
    type: TSType
) : Symbol(name, type) {
    val parameters: MutableList<MethodParameter> = mutableListOf()

}
