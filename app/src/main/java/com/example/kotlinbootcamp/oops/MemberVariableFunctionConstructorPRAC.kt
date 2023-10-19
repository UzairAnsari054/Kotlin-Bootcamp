package com.example.kotlinbootcamp.oops


fun main() {

//    var salman = Person1(firstName = "Salman")
//    var amir = Person1(firstName = "Amir", lastName = "Khan", hobby = "Acting")
//    salman.hobby = "Gym"
//    salman.stateHobby()


    val muslim = Human("Islam", "Muslim")
    muslim.holyDay = "Friday"
    muslim.changeStateHolyDay()

    Human("Christianity", "Christians")
    Human("Hinduism", "Hindu", "Monday")

}

class Human(religion: String, worshiper: String) {

    var holyDay: String? = null
    fun changeStateHolyDay(){
        println(holyDay)
    }
    init {
        println("$religion - $worshiper")
    }

    constructor(religion: String, worshiper: String, holyDay: String): this(religion, worshiper) {
        this.holyDay = holyDay
        println("This is Secondary Constructor ---> $religion, $worshiper, $holyDay")
    }
}











class Person1(firstName: String = "Srk", lastName: String = "Bravo") {

    //This is Member Variable
    var hobby = "Cardio "

    var firstName: String? = null

    //This is Member Function
    fun stateHobby() {
        println("${this.firstName}'s Hobby is $hobby")
    }

    init {
        this.firstName = firstName
        println("This is from Primary Constructor ---> $firstName - $lastName")
    }

    //This is Member Function                           // this first & last names will come from primary constructor
    constructor(firstName: String, lastName: String, hobby: String) : this(firstName, lastName) {
        //hobby declared on top = parameter hobby
        this.hobby = hobby
        println("This is from Secondary Constructor ---> $firstName : $lastName : $hobby")
    }
    // To call Secondary Constructor of a class you just need to call the Class with
    // same number of parameter the Secondary Constructor has.
}
