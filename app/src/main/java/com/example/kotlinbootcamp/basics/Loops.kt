package com.example.kotlinbootcamp.basics

fun main() {

    //DO WHILE LOOP
    var y = 1
    do {
        y++
        print(y)
    } while (y <= 10)
    print("\n$y\n")
    println()

    //-------------------------------

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
        println(roomTemp)
    }
    println()

    //-------------------------------

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid") {
        humidityLevel -= 5
        println("Humidity Reduced")
        if (humidityLevel <= 60) {
            humidity = "comfy"
            println("It's comfy now")
        }
    }
    println()

//-------------------------------

    for (num in 1 until 10) {
        print("$num ")
    }
    println()

    for (num in 10 downTo 1 step 2) {
        print("$num,")
    }
    println()

    for (i in 1 until 10 step 2) {
        print(i)
    }
    println()

    for (num in 1..10000) {
        if (num == 9001) {
            println("It's over 9000!!")
        }
    }
    println()

}