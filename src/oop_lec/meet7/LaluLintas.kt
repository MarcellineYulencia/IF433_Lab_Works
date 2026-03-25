package oop_lec.meet7

enum class LaluLintas(val arti: String) {
    MERAH("Berhenti"),
    KUNING("Hati"),
    HIJAU("Jalan");

    fun cetak_LaluLintas() {
        println("Lampu lalulintas: " + arti)
    }
}