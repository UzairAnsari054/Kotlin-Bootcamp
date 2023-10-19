package com.example.kotlinbootcamp.oops

import java.lang.IllegalArgumentException

fun main(){

    val car = Car()
    println(car.brand)

    car.maxSpeed = 2
    println(car.maxSpeed)

    // model can only be access(Get) because model's Setter property is made private
    println(car.model)
}

class Car(){
    // lateinit is, basically you are saying you will initialize it later on.
    lateinit var owner: String

    // Getters
    var brand = "BMW"
        // Here when brand is accessed, they'll get lower version of BMW
        get() = field.toLowerCase()

    // Setters
    var maxSpeed = 250
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Max speed can't be negative")
        }

    var model = "M5"
        private set

    init {
        this.model = "M3"
        println(model)
    }
}


