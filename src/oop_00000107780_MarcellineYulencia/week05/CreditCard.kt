package oop_00000107780_MarcellineYulencia.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        println("Credit Card [$accountName] mencoba membayar Rp $amount")
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil. Total pemakaian: Rp $usedAmount\n")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu.")
        }
    }
}