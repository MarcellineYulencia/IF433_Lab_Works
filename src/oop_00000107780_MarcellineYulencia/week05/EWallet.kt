package oop_00000107780_MarcellineYulencia.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        println("E-Wallet [$accountName] mencoba membayar Rp $amount")
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil. Sisa saldo: Rp $balance\n")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: Rp $balance\n")
    }
}