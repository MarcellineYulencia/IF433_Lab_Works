package oop_lec.week8

class Alamat(val nomor: String, val kota: String)
class Mahasiswa(val nama: String, val addr: Alamat?)

fun main() {
    val alm = Alamat("48", "Tangerang")
    val mhs = Mahasiswa("Celline", alm)

    //kalau alamatnya null, kita akan kasih nilai default
    val defKota = mhs.addr?.let {
        alamatDefault->"Tinggal di ${mhs.addr.kota} nomor ${mhs.addr.nomor}"
    }?: "Tidak tau tinggal dimana"

    println("hai ${mhs.nama} kamu tinggal di ${defKota}")
}