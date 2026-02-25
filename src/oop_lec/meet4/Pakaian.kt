package oop_lec.meet4

open class Pakaian {
    private var merk: String = ""
    protected var harga: Int = 0

    init {
        this.merk = "Uniqlo"
        println("merk is $merk")
    }

    open public fun jumlah_penjualan() {
        println("Pakaian terjual")
    }
}