package com.example.kotlinbootcamp.oops

// An Interface can inherit from another Interface
// An Interface cannot be instantiated, means you can't create object of Interface

// Why Use Interfaces?
// Interfaces are super useful when you have certain functions/properties in mind that you
// want to implement later on. It's like preparing everything up for later use.

// Difference between Abstract Class & Interface
// - An Interface can't hold state/field an Abstract Class can hold state/fieldz
// - You can inherit from Multiple Interface but you can inherit only from One Abstract Class
// - Also, because Classes has constructor & so Abstract Class has constructor that helps to assign values
//   to parameter of class when an object of that class is created. Interface don't have constructors.
// So, basically Abstract Classes can have everything that Interface don't have, like States & Fields

interface Drivable {
    var maxSpeed: String
    fun drive(): String
    fun brake() {
        println("Braking in interface")
    }
}

open class MyCar(model: String, brand: String, override var maxSpeed: String) : Drivable {
    open var range: Int = 20

    open fun drive(distance: Int) {
        println("Drove $distance KM")
    }

    override fun drive(): String {
        println("Driving from interface with $maxSpeed")
        return ""
    }
}

class MyECar(
    model: String,
    brand: String,
    battery: Int,
    maxSpeed: String
) : MyCar(model, brand, maxSpeed) {
    override var range = battery * 10

    override fun drive(distance: Int) {
        super.drive(distance) // This call the parent class drive() Function
        println("Drove $distance on eCar & range is $range")
    }

}

fun main() {
    val car = MyCar(model = "A6", brand = "Audi", maxSpeed = "300")
    val eCar = MyECar(model = "Model S", brand = "Tesla", battery = 85, maxSpeed = "150")

//    car.maxSpeed
    car.drive()
    eCar.drive()

//    eCar.drive(200)
}