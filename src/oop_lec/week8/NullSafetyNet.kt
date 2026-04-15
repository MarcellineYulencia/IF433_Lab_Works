package oop_lec.week8

fun main() {
    var nama: String? = "Celline"
    val kumpulanData: List<Any> = listOf(123, "Budi", 2024, "Tangerang")

    try {
        println("nama kamu ${nama!!.uppercase()}")
    } catch (ex: Exception) {
        println("kamu kena error, ini pesan err-nya: ${ex.message}")
    }

    for(item in kumpulanData) {
        val isiData = item as? String
        if(isiData != null) {
            println(isiData)
        }
    }
}