package com.example.kotlinbootcamp


//Need better examples to Practice
open class Vehicle

open class MyCar(name: String, brand: String) : Vehicle() {
    open var range: Double = 0.0

    fun extendedRange(amount: Double) {
        if (amount > 0) {
            range += amount

        }
    }

    open fun drive(distance: Double) {
        println("Drove $distance KM, The range is $range")
    }

}

class MyECar(name: String, brand: String, batteryLife: Double) : MyCar(name, brand) {

    val chargerType = "Type1"
    override fun drive(distance: Double) {
        super.drive(distance)
        println("This is override Drive")
    }

    override var range = batteryLife * 6
    fun drive() {
        println("Drove $range KM on electricity")
    }
}

fun main() {
    val audi = MyCar("A6", "Audi")
    val tesla = MyECar("S-Model", "Tesla", 100.0)

    audi.extendedRange(100.0)
    audi.drive(200.0)
    tesla.drive(200.0)
    tesla.drive() //This calls 2 drive functions

    println(tesla.chargerType)
}
