package oop_lec.meet7

    fun main() {
        println("Server: " + Koneksi.alamatServer)
        Koneksi.konek_db()

        println("Kampus: " + Hitungan.namaKampus)
        println("Nomor: " + Hitungan.nomorIndukKampus)
        println("Tambahan: " + Hitungan.penambahan(10,20))

        Hitungan.pindah_halaman("Profile")

        val siswa = Murid("Andi", "123", 2024)
        val siswa2 = siswa.copy(nama = "Ani", nim = "321")
        println(siswa)
        println(siswa2)
        println("Nama siswa: " + siswa.nama + " angkatan: " + siswa.angkatan)

        println(LaluLintas.MERAH)
        println(LaluLintas.KUNING)
        println(LaluLintas.HIJAU)

        LaluLintas.KUNING.cetak_LaluLintas()
    }
