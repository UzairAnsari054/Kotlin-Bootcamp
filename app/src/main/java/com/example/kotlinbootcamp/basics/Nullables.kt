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

    // Example:
    // In our db we have a list of user but we don't have the age of most of the users.
    // So we make variable age as null, as if for a user we get the age then we'll display it,
    // otherwise we won't display the age and the code will still runs without issues
    var age: Int? =  null
}