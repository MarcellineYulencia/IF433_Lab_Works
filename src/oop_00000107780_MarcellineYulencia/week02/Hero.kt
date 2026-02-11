package oop_00000107780_MarcellineYulencia.week02

class Hero(val name: String, var hp: Int = 100, var baseDamage: Int) {
    fun attack(targetName: String) {
        println("$name menebas $targetName");
    }

    fun takeDamage(damage: Int) {
        hp -= damage;

        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}