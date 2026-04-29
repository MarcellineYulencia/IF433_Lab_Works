package oop_lec.week10

// Non-Generic Programming
class meja (val hasil: Any)

// Generic Programming
class kursi<T>(val hasil: T)

// Multi Param
class Televisi<T, V>(val merk: T, val kodeBarcode: V)

// Generic - Function
fun <T> Alamat(kodepos: T):T{
    return kodepos
}

// Generic - Constraint
class Kalkulator <T:Number> (val a: T,val b: T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble()
    }
}

// Generic - WHERE
val arNilai = listOf(60,70,85,75,63,83,92,76,46,71)
fun <T> nilaiDiatasKKM(list: List<T>, kkm: T): List<T> where T: Comparable<T> {
    return list.filter {it >= kkm}
}

fun main() {
    println("========= Generic - WHERE ========")
    println("Semua nilai: " + arNilai)
    var nilaikkm = nilaiDiatasKKM(arNilai, 70)
    println("Nilai diatas KKM: " + nilaikkm)

    println("\n========= Generic - Kalkulator ========")
    val kal = Kalkulator(10.5, 20.43)
    println("Hasil Penambahan ${kal.a} + ${kal.b} : " + kal.tambah())
    println("Hasil Pengurangan ${kal.a} - ${kal.b} : " + kal.kurang())

    println("\n========= Implementasi Non-Generic ========")
    val mj = meja(200)
    val hargaMeja = mj.hasil as Int
    println(hargaMeja)

    println("\n========= Implementasi Generic ========")
    val chair = kursi(300)
    println(chair.hasil + 50)

    println("\n========= Implementasi Multi Param ========")
    val tv= Televisi("Samsung", 88477)
    println("Merknya: " + tv.merk)
    println("Barcodenya: " + tv.kodeBarcode)

    println("\n========= Generic Function ========")
    println("Kode pos kamu " + Alamat(12345))
}