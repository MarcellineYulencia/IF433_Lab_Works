package oop_00000107780_MarcellineYulencia.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`);

    println("--- SISTEM PEMINJAMAN BUKU ---");

    print("Judul buku: ");
    val title = scanner.nextLine();

    print("Nama peminjam: ");
    val borrewer = scanner.nextLine();

    print("Lama pinjam (hari): ");
    var duration = scanner.nextInt();

    if (duration <= 0) { // validasi durasi menggunakan <= karena tidak mungkin ada durasi 0
        duration = 1;
    }

    val loan = Loan(title, borrewer, duration);

    println("--- Detail Peminjaman ---");
    println("Judul buku : ${loan.bookTitle}");
    println("Peminjam   : ${loan.borrower}");
    println("Lama pinjam: ${loan.loadDuration}");
    println("Total denda: Rp ${loan.calculateFine()}");
}