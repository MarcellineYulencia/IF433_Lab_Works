package oop_00000107780_MarcellineYulencia.week05

fun main() {
    val eWallet = EWallet("Celline", 50000.0)
    val creditCard = CreditCard("Celline", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("\n=== SISTEM PEMBAYARAN E-COMMERCE ===")
    for (payment in paymentMethods) {
        payment.processPayment(75000.0)
    }
}