package com.example.kotlinbootcamp.oops

//Use Inheritance and Interface together

interface Drivable {
    var maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("Breaking")
    }
}

class Carr(override var maxSpeed: Double): Drivable {
    override fun drive() =  "driving"

}

fun main() {

}