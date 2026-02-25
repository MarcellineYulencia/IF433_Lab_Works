package oop_00000107780_MarcellineYulencia.week04

fun main() {
    val manager = Manager("Celline", 16000000)
    val developer = Developer("Opet",12000000,"Phyton")

    manager.work()
    println("Gaji: Rp ${manager.baseSalary}\nBonus Manager ${manager.name}: Rp ${manager.calculateBonus()}\n")

    developer.work()
    println("Gaji: Rp ${developer.baseSalary}\nBonus Developer ${developer.name}: Rp ${developer.calculateBonus()}")
}