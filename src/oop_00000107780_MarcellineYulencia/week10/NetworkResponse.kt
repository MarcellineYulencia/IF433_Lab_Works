package oop_00000107780_MarcellineYulencia.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)