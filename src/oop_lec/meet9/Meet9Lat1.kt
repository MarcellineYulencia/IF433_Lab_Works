package oop_lec.meet9

fun main() {
    println("================== LIST OF IMUT ==================")
    val arSiswa = listOf("Ali", "Budi", "Cica")
    // view isi array list
    println(arSiswa)
    // munculin satu item saja
    println("Nama siswa: " + arSiswa[1])
    // menghitung banyak item
    println("Banyak siswa: " + arSiswa.size)
    // munculin semua siswa
    for(i in arSiswa) {
        println("Ini siswanya: " + i)
    }

    println("\n================== LIST OF MUTABLE ==================")
    val arMatkul = mutableListOf("OOP", "Matdis", "GameDev")
    arMatkul.add("Kalkulus")
    arMatkul[2] = "Pemweb"
    arMatkul.remove("Matdis")
    println(arMatkul)

    println("\n================== SET OF IMUTABLE ==================")
    var arNilai = setOf(80,90,20,30,90,70,20,10,100)
    println("Banyak data: ${arNilai.size}")
    println("Angka 20 ada ga? ${arNilai.contains(20)}")
    println(arNilai)

    println("\n================== SET OF IMUTABLE ==================")
    var arMakanan = mutableSetOf("Nasi goreng", "Tempe", "Tahu", "Bakpao", "Tahu", "Ayam")
    arMakanan.add("Mie")
    arMakanan.remove("Tahu")
    arMakanan.add("Tempe")
    println(arMakanan)

    println("\n================== MAP  IMUTABLE ==================")
    var arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 83
    );
    println("Banyak data: ${arDataMhs.size}")
    println("Si Acong nilainya: ${arDataMhs["Acong"]}")
    println("List semua Mahasiswa: ${arDataMhs.keys}")
    println("List semua Nilai: ${arDataMhs.values}")
    println(arDataMhs)

    println("\n================== MAP  MUTABLE ==================")
    var arMenuResto = mutableMapOf(
        "Mie ayam" to 5000,
        "Mie bakso" to 6000,
        "Mie pangsit" to 6500
    )

    arMenuResto["Mie bakso"] = 6200
    arMenuResto.remove("Mie ayam")
    println(arMenuResto)

    println("\n================== LAMBDA ==================")
    // cara lama tulis ke bawah
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }
    println("Hasil tambah ${tambah(10,3)}")

    // cara baru -> function ditulis ke samping
    var kurang = {a: Int, b: Int -> a - b }
    println("Hasil kurang ${kurang(10,3)}")

    println("\n================== LAMBDA (IT) ==================")
    val pangkat = {a: Int -> a*a}
    val hitungPangkat: (Int) -> Int = {it*it}
    println("Hasil pangkat adalah ${hitungPangkat(5)}")

    println("\n================== FOREACH ==================")
    //looping fo biasa
    for(a in arMakanan) {
        println(a)
    }

    println("\n================== FOREACH { IT } ==================")
    arMakanan.forEach {
        println(it)
    }

    println("\n================== FOREACH {variable} ==================")
    arMakanan.forEach {
        mkn -> println(mkn)
    }
}