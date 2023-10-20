package com.example.kotlinbootcamp.oops

// An Abstract Class cannot be instantiated, means you can't create object of Abstract Class

// Difference between Abstract Class & Interface
// - An Interface can't hold state/field an Abstract Class can hold state/fieldz
// - You can inherit from Multiple Interface but you can inherit only from One Abstract Class
// - Also, because Classes has constructor & so Abstract Class has constructor that helps to assign values
//   to parameter of class when an object of that class is created. Interface don't have constructors.
// So, basically Abstract Classes can have everything that Interface don't have, like States & Fields

abstract class Mammal(
    private val name: String,
    private val origin: String,
    private val weight: Int
) {

    //use abstract when you don't know/have the value or implementation and
    //you need to initialize variables and implement function according to
    //specific classed that inherits from Abstract class

    //when you make variable Abstract, you don't need to initialize it
    abstract var maxSpeed: Double

    //when you make variable Abstract, you don't need to make it's body
    abstract fun run()
    abstract fun breath()

    fun displayDetails() {
        println("$name $origin $weight $maxSpeed")
    }
}

class Humann(
    name: String,
    origin: String,
    weight: Int,
    override var maxSpeed: Double
) : Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on 2 legs")
    }

    override fun breath() {
        println("Breaths from mouth or nose")
    }
}

class Elephant(
    name: String,
    origin: String,
    weight: Int,
    override var maxSpeed: Double
) : Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on 4 legs")
    }

    override fun breath() {
        println("Breaths from trunk")
    }
}

fun main() {
    val human = Humann("Uzair", origin = "India", weight = 115, maxSpeed = 25.0)
    val elephant = Elephant("Rosy", origin = "Africa", weight = 5500, maxSpeed = 20.0)

    human.run()
    human.breath()

    elephant.run()
    elephant.breath()
}