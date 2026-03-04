package oop_00000107780_MarcellineYulencia.week05

abstract class PaymentMethod(val accountName:String) {
    abstract fun processPayment(amount: Double)
}