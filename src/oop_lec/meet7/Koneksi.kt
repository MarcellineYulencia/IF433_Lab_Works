package oop_lec.meet7

object Koneksi {
    var alamatServer: String = "http://localhost:8000"
    fun konek_db(){
        println("Konek ke database saya di $alamatServer")
    }
}