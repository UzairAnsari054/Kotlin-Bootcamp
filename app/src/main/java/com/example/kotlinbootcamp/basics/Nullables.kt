package com.example.kotlinbootcamp.basics

fun main() {
    var name: String? = "Uzair"
    //name = null

    // Safe Call Operator(?)
    name?.let { println(it) }

    // Non-Null Assertion Operator(!!)
    println(name!!.length)

    // Elvis Operator
    name = null
    var name2 = name ?: "Guest"
    println(name2)
}