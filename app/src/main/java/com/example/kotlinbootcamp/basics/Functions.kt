package com.example.kotlinbootcamp.basics

fun main() {
    var result = add(5.5, 4.5)
    println(result)
}

fun add(a: Double, b: Double): Double {
    return a + b
}