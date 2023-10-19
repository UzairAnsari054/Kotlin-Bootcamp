package com.example.kotlinbootcamp


data class User(val id: Int, var name: String)
fun main() {

    // Copy Function
    val user1 = User(1, "Brock")
    val user2 = user1.copy(name = "Goldberg ")
    println(user1)
    println(user2)

    val (id, name) = user2
    println("$id - $name")
}