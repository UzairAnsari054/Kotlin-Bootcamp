package com.example.kotlinbootcamp.basics.more_basics

fun main() {

    // Without Lambda
    fun add(a: Int, b: Int) {
        val result = a + b
        println(result)
    }
    add(5, 3)

    // With Lambda
    val sum = { a: Int, b: Int -> a + b }
    sum(1, 2)
}