package oop_00000107780_MarcellineYulencia.week01

fun main() {
    val gameTitle = "Stardew Valley"
    val price = 70000

    val finalPrice = calculateDiscount(price)
    println("Price: $price, finalPrice: $finalPrice")
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100