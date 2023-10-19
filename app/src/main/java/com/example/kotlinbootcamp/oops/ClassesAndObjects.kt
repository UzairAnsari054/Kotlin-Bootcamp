package com.example.kotlinbootcamp.oops

fun main() {

    /*
    Classes are a blueprint/design of one or multiple objects.
    Those Objects can have some features which in a class can be called as Properties,
    and using those features that Object would do something which in a class can be called as Functions.
    So after you define a class, you can use the same class to create multiple objects

    If i define a class Peron, the person would have some features (eyes, ears, mouth, legs)
    and using those features the person would do something (see, listen, speak, walk)
    Now i can create multiple objects of class person and use the features as properties
    and also can access the function of the class Person
    When we have to create Object of a class the Constructor of the class
    helps us to put values in that Object. There's a Primary constructor for every class by default that
    does not needs to be defined specifically, unless you need to make that constructor private
     */


    var uzair = Person("Uzair", "Ansari")
    var mukul = Person("Mukul", "Jangir")
    var jonny = Person()
    var james = Person(firstName = "James")

    var samsung = MobilePhone("Android", "Galaxy", "S20")
    samsung.chargeBattery()

    var iphone = MobilePhone("Apple", "Iphone15", "Pro Max")
    var Realme = MobilePhone("Xaomi", "Realme", "Ulra Thin")

}

class Person(firstName: String = "Jonny", lastName: String = "Bravo") {
    init {
        println("$firstName - $lastName")
    }
}

class MobilePhone(osName: String, brand: String, model: String) {

    var battery = 20
    var chargedPercent: Int = 0

    fun chargeBattery() {
        println("Initial Charging - $battery")
        while (battery < 30) {
            battery += 5
            chargedPercent += 5
        }
        println("chargedPercent - $chargedPercent")
        println("Total Charging - $battery")
    }

    init {
        println("$osName - $brand - $model")
    }
}
