package oop_00000107780_MarcellineYulencia.week03

fun main() {
    val weapon = Weapon("Sword")

    weapon.damage = -5

    println("Damage senjata: ${weapon.damage}")
    println("Tier senjata: ${weapon.tier}")

    weapon.damage = 9999

    println("Damage senjata: ${weapon.damage}")
    println("Tier senjata: ${weapon.tier}")
}