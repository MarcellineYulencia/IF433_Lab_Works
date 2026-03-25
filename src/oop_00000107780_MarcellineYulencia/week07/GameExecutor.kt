package oop_00000107780_MarcellineYulencia.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Mendapat loot: ${event.item.name} (${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di zona aman.")
        }
    }
}