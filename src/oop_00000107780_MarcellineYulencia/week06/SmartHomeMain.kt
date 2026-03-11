package oop_00000107780_MarcellineYulencia.week06

fun main() {
    val lamp = SmartLamp("1","Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== SECURITY MODE ===")
    hub.activateSecurityMode()

    println("\n=== TURN OFF ALL DEVICES ===")
    hub.turnOffAllSwitches()
}