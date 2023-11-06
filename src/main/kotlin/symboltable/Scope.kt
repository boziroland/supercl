package symboltable

import symboltable.Scope.Level.level

class Scope(
    val parent: Scope? = null,
    val children: MutableList<Scope> = mutableListOf(),
    val name: String = if (parent == null) "Global scope" else "Scope ${level++}",
    private val map: MutableMap<String, Symbol> = hashMapOf(),
) : MutableMap<String, Symbol> by map {
    init {
        parent?.children?.add(this)
    }

    override fun get(key: String): Symbol? = map[key] ?: this.parent?.get(key)

    override fun put(key: String, value: Symbol): Symbol? {
        return map.put(key, value)
    }

    object Level {
        var level = 0
    }
}