package oop_lec.week12

fun basic_trycatch(pembilang: Int, penyebut: Int){
    try {
        val hasil = pembilang / penyebut
        println("Hasil bagi $hasil")
    } catch (e: Exception) {
        println("Ada error pembagian ${e.message}")
    } finally {
        println("Pembagian selesai")
    }
}

fun cek_tipe_data(angka: String) {
    var nilai:Int = try {
        Integer.parseInt(angka)
    } catch (e: Exception) {
        println("ada error di cek tipe data ${e.message}")
        123
    }
    println("Nilai kamu $nilai")
}

fun cek_gaji(hariKerja: Int) {
    if(hariKerja < 0){
        throw IllegalArgumentException("Masa hari kerja minus")
    } else {
        val gaji = hariKerja * 1000
        println("Gaji kamu $gaji")
    }
}

// custom exception -> Class
class cekSaldoBank(val saldoKamu: Int, val jajanKamu: Int)
    : Exception("Saldo kamu $saldoKamu, jajan kamu $jajanKamu, gak cukup lah!!!")

class transaksi_pembelian(val saldoAwal: Int) {
    fun mulai_jajan(pengeluaranKamu: Int) {
        if(saldoAwal < pengeluaranKamu) {
            throw cekSaldoBank(saldoAwal, pengeluaranKamu)
        } else {
            val sisaSaldo = saldoAwal - pengeluaranKamu
            println("Sisa saldo kamu $sisaSaldo")
        }
    }
}

fun multi_catch(input:String, penyebut:Int){
    try {
        val num:Int = input.toInt()
        println("hasil pembagian adalah: ${num/penyebut}")
    } catch (e: NumberFormatException) {
        println("Ada error multicatch, salah format ${e.message}")
    } catch (e: ArithmeticException) {
        println("Ada error multicatch, salah arithmetic ${e.message}")
    } catch (e: Exception) {
        println("Ada error multicatch, salah arithmetic ${e.message}")
    }
}

//Run Cathcing IDIOM
sealed class ATMException(val pesan: String): Exception(pesan)

class cek_saldo(val saldo: Int):ATMException("Saldo ga cukup, karena sisa $saldo")

class batas_jajan(val amount: Int):ATMException("Jajan melebihi limit harian")

fun mulai_jajan(saldoSaya: Int, jajanSaya: Int) {
    if(jajanSaya > 1000) {
        throw batas_jajan(jajanSaya)
    } else if (saldoSaya < jajanSaya) {
        throw batas_jajan(saldoSaya)
    } else {
        println("Sisa saldo kamu adalah ${saldoSaya - jajanSaya}")
    }
}
fun main () {
    multi_catch("10", 2)

    val trxBeli = transaksi_pembelian(1000)
    try {
        trxBeli.mulai_jajan(800)
    } catch (e: Exception) {
        println("ada error di custom exception ::: ${e.message}")
    }

    // Coba Throw
    try {
        cek_gaji(-1)
    } catch (e: Exception) {
        println("Error coba catch ::: ${e.message}")
    }

    // Exception - Expression
    cek_tipe_data("abc")

    basic_trycatch(10, 0)

    runCatching { mulai_jajan(2000, 2000) }
        .onSuccess { println("Transaksi Sukses: ${it}") }
        .onFailure { println("Transaksi Gagal: ${it}") }

}