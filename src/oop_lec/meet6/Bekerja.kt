package oop_lec.meet6

interface Bekerja {
    public val namaKerjaan: String
    val gaji:Int
    val jmlHari:Int
    val GajiDidapat:Int
        get() = gaji * jmlHari

    public fun ngoding()

    public fun  tester() {
        println("Tes kerjaan baru")
    }
}