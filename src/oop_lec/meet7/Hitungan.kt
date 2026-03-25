package oop_lec.meet7

class Hitungan private constructor(var halaman: String) {
    companion object {
        const val namaKampus: String = "UMN"
        const val nomorIndukKampus: String = "123456"

        fun penambahan(a: Int, b: Int): Int {
            return a + b
        }

        fun pindah_halaman(namaHal: String) {
            Hitungan (halaman=namaHal)
        }
    }

    init {
        if(halaman == "home") {
            println("Welcome Home")
        } else {
            println("Halaman lainnya")
        }
    }
}