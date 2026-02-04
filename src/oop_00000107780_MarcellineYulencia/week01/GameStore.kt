package oop_00000107780_MarcellineYulencia.week01

fun main() {
    val gameTitle = "Stardew Valley"
    val price = 70000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, price = price, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String?) {
    println("Title: $title")
    println("Price: Rp$price")
    println("FinalPrice: Rp$finalPrice")
    println("Note: ${note ?: "Tidak ada catatan"}")
}