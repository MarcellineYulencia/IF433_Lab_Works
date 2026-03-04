package oop_00000107780_MarcellineYulencia.week05

fun main() {
    val mathHelper = MathHelper()

    println("=== PERHITUNGAN LUAS BANGUN DATAR ===")

    println("Luas Persegi: ${mathHelper.hitungLuas(2)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(2,3)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(10.0)}")
}