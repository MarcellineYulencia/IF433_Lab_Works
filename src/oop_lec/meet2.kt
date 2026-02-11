package oop_lec

class Jagoan {
    var nama: String = "giku";
    var hp: Int = 100;

    init {
        println("Halo saya contructor");
        nama = "ceyin :p";
        hp = 1000;
    }

    constructor(darahhero: Int = 200) {
        println("Ini constructor keduaaaaa :D");
        this.hp = darahhero;
    }
    fun jalan() {
        println("Hero $nama jalan kaki ke pasar");
    }

    fun serang() {
        println("Hero serang dengan life: $hp");
    }
}

fun main() {
    val hero = Jagoan(250); //object nama variablenya: hero
    hero.nama = "Ikan"
    println("nama hero: ${hero.nama}");
    println("darah hero: ${hero.hp}");
    hero.jalan();
    hero.serang();
}