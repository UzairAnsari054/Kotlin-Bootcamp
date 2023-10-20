package com.example.kotlinbootcamp.basics.more_basics


// Just as you can make array of Integers, String, etc,
// you can also make array of Object of Data Classes

fun main() {
    val numbers = intArrayOf(1, 2, 3)
    println(numbers.contentToString())
    for (i in numbers) {
        println(i)
    }

    numbers[0] = 3
    numbers[1] = 2
    numbers[2] = 1
    //numbers[3] = 0 // index is always 1 less than the length
    println(numbers.contentToString())

    val mutableNumbers = numbers.toMutableList()
    mutableNumbers.add(3, 4)
    println(mutableNumbers)

    //Array of objects of data class Fruit
    val fruit = arrayOf(
        Fruit("Mango", 300.0),
        Fruit("Orange", 200.0),
        Fruit("Banana", 100.0)
    )
    println(fruit.contentToString())
    for (i in fruit) {
        println("${i.name} - $i")
    }

    for (i in fruit.indices) {
        println("${fruit[i].name} - $i")
    }
}

data class Fruit(val name: String, val price: Double)