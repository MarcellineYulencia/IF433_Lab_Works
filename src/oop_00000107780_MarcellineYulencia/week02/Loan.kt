package oop_00000107780_MarcellineYulencia.week02

class Loan (val bookTitle: String, val borrower: String, val loadDuration: Int = 1) {
    fun calculateFine(): Int {
        return if (loadDuration > 3) {
            (loadDuration - 3) * 2000;
        } else {
            0;
        }
    }
}
