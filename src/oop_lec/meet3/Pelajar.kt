package oop_lec.meet3

import javax.xml.transform.sax.SAXResult

open class Pelajar {
    private var nama: String = "Belum ada nama";
    private var nilai: Int = 0;
    protected var jmlsks: Int = 3;

    public var uangjajan: Int = 1000

    set(value) {
        if (value < 0) {
            println("Uang jajan gabole minus :p ")
        } else {
            field = value;
        }
    }

        get() {
            return field + 1000000;
        }

    public fun set_nama(namaorang: String) {
        if (namaorang.length < 0) {
            println("eh nama orang gabole kosong");
        } else {
            this.nama = namaorang;
        }
    }

    public fun get_nama(): String {
        return this.nama;
    }

    public fun set_nilai(nilaiorang: Int) {
        if (nilaiorang < 0) {
            println("eh nilai orang gabole minus");
        } else if (nilaiorang > 100 ) {
            println("eh nilai orang gabole lebih dari 100");
        } else {
            this.nilai = nilaiorang;
        }
    }

    public fun get_nilai(): Int {
        return this.nilai;
    }
}

class MataKuliah: Pelajar() {
    fun muncul_namasks(): Int {
        return this.jmlsks;
    }
}

fun main(){
    val mahasiswa = MataKuliah(); // Mau panggil semua bisa panggil anak paling kici
    mahasiswa.set_nama("Ikan");
    mahasiswa.get_nama();
    println("Nama kamu: ${mahasiswa.get_nama()}");
    mahasiswa.set_nilai(-50);
    mahasiswa.get_nilai();
    println("Nilai kamu: ${mahasiswa.get_nilai()}");
    println("Sks kamu: ${mahasiswa.muncul_namasks()}");

    mahasiswa.uangjajan = -1000;
    println("Jajan kamu: ${mahasiswa.uangjajan}");
    //println("Hai ${mahasiswa.nama}, nilai kamu ${mahasiswa.nilai}");
}