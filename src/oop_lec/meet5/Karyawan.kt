package oop_lec.meet5

abstract class Karyawan {
    val nama: String = "Budi"

    abstract fun bekerja(kecepatan: Int = 3): String

    fun terima_gaji(){
        println("Hore gajian!!!")
    }
}

class Staff : Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Staff ngetik, kecepatan: $kecepatan"
    }

    fun pegang_uang(): String {
        return "Staff pegang uang!"
    }
}

class Manager : Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Manager mengawasi $kecepatan km/jam"
    }

    fun quality_control(): String{
        return "Manager melakukan quality control!"
    }
}

fun main(){
    var listKry:List<Karyawan> = listOf(
        Staff(),
        Manager()
    )

    println("Jenis karyawan ada " + listKry.size)

    for(kry in listKry){
        println("Kerjanya karyawan: " + kry.bekerja(2))

        // manggil fun dengan nama method beda - cara1
        if(kry is Staff) {
            println(kry.pegang_uang())
        } else if(kry is Manager){
            println(kry.quality_control())
        }

        // manggil fun nama method beda - cara2
        when(kry){
            is Staff -> {
                println("When staff: " + kry.pegang_uang())
            }
            is Manager -> {
                println("When manager: " + kry.quality_control())
            }
        }
    }

    /*val staff = Staff()
    println("Staff kerja: ${staff.bekerja(7)}")

    val manager = Manager()
    println("Manager kerja: ${manager.bekerja(12)}")*/
}