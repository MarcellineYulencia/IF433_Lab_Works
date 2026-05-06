package oop_00000107780_MarcellineYulencia.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTime(n: Int): String {
    return this.repeat(n)
}