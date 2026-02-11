package oop_00000107780_MarcellineYulencia.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG GAME ---");

    print("Masukkan Nama Hero: ");
    val name = scanner.nextLine();

    print("Masukkan Base Damage: ");
    val damage = scanner.nextInt();

    val hero = Hero(name, damage);

    var enemyHp = 100;

    while (hero.isAlive() && enemyHp > 0 ) {
        println("\n--- Menu ---");
        println("1. Serang");
        println("2. Kabur");
        print("Pilihan (1/2): ");
        val answer = scanner.nextInt();

        when (answer) {
            1 -> {
                hero.attack("Musuh");
                enemyHp -= hero.baseDamage;
                println("Sisa HP Musuh adalah $enemyHp");

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random();
                    hero.takeDamage(enemyDamage);

                    println("\nMusuh menyerang balik dengan damage: $enemyDamage")
                    println("Sisa HP ${hero.name} adalah ${hero.hp}")
                }
            }
            2 -> {
                println("${hero.name} kabur!");
                break;
            }
        }
    }

    println("\n--- Hasil pertarungan ---");
    if (hero.hp > enemyHp) {
        println("${hero.name} menang");
    } else if (hero.hp < enemyHp){
        println("Musuh menang!");
    } else {
        println("Pertarungan seri!");
    }
}