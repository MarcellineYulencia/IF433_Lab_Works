package oop_lec.week8

class set_krs(val nim: String?, val tahun: Int?) {
    fun pilih_matkul(kodeMatkul: String?) {
        println("Matkul dipilih $kodeMatkul")
    }
}

fun main() {
    var nama: String? = "Celline"
    nama = null
    println("hai $nama")

    val setKRS = set_krs(nim = "01234", tahun = 2024)
    println("si ${setKRS.nim} masuk tahun ${setKRS.tahun}")
    setKRS.pilih_matkul(null)
}