package oop_lec.meet11

// function biasa
fun salam_pembuka(nama: String) {
    if(nama=="budi gunawan") {
        println("Salam kenal")
    } else {
        println("Ih kamu siapa")
    }
}

// function extension - basic
fun String.rubah_huruf_depan_jadi_besar(): String {
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return "Hai $hasil"
}

// function extension - parameters
fun Int.tentukanGrade(namaMhs: String) {
    var hasilGrade = "E"
    if(this>=80) {
        hasilGrade = "A"
    } else if(this>=70){
        hasilGrade = "B"
    } else {
        hasilGrade = "C"
    }
    println(namaMhs + " Grade kamu " + hasilGrade)
}

fun String?.cekNulldanEmpty(): String {
    if(this == null || this.isEmpty()) {
        return "Username gaboleh null atau empty"
    } else {
        return "Username kamu $this"
    }
}

class Mahasiswa() {
    var nim: String = ""
    var nama: String = ""
    var nilai: String = ""
}

fun main(){
    var namaSaya = "budi gunawan"
    salam_pembuka(namaSaya)
    println(namaSaya.uppercase())

    // cara panggil function extension - Dasar
    println("udin sedunia kdvfjsdjvsdjkv fsjdnfcdsj".rubah_huruf_depan_jadi_besar())

    // cara panggil function extension - parameters
    71.tentukanGrade("Maku")

    // cara panggil function extension - null
    var usernameKamu: String? = null
    println(usernameKamu.cekNulldanEmpty())

    // SCOPE - LET
    var kampusKamu: String = "UMN"
    kampusKamu.let {
        println("Nama kampus kamu " + it)
        if (it == "UMN") {
            println("Ih keren")
        } else {
            println("Amazing")
        }
    }

    // SCOPE - RUN
    var namaMatkul = "OOP"
    namaMatkul.run {
        println("Matkul favorite saya " + this)
    }

    // SCOPE - WITH
    val keputusanLulus = with(70) {
        if(this>=70) {
            "Lulus"
        } else {
            "Remedial"
        }
    }
    println("kamu $keputusanLulus")

    // SCOPE - APPLY
    val namaMahasiswa = Mahasiswa().apply {
        nim = "12345"
        nama = "Dwiky"
        nilai = "100"
    }
    println("si ${namaMahasiswa.nama} nilainya ${namaMahasiswa.nilai}")

    // SCOPE - ALSO
    val arDeret = mutableListOf<Int>(60,70,56,80)
    arDeret.also {
        println("Deret sebelum: $arDeret")
    }.add(90)
    println("Deret Setelah: $arDeret")
}