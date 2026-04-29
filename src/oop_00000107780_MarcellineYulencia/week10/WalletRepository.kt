package oop_00000107780_MarcellineYulencia.week10

interface NamedEntity {
    val name: String
}

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun <T : NamedEntity> searchByName(
        list: List<T>,
        keyword: String
    ): List<T> {
        return list.filter { it.name.contains(keyword, ignoreCase = true) }
    }
}