package com.example.kotlinbootcamp.basics.more_basics


//SETS
// Set is a type of collection that Eliminates Duplicate Data
// Set is unordered means, the elements are not sorted
// Immutable = SetOf
// mutable = MutableSetOf
//  = hashSetOf

//MAPS
// Map is a type of collection that holds value in a key value pair
// Each key is unique means, keys hold only 1 value
fun main() {

    // SETS
    val fruits = setOf("Mango", "Apple", "Orange", "Banana", "Apple", "Mango")
    println(fruits.toSortedSet())

    val mutableFruit = fruits.toMutableList()
    val addList = mutableListOf("Water Melon", "Kiwi")
    mutableFruit.addAll(addList)
    println(mutableFruit)

    println(mutableFruit.elementAt(1))

    //MAPS
    val daysOfWeek = mapOf(1 to "Mon", 2 to "Tue", 3 to 2)
    println(daysOfWeek[3]) //here it's not index, it key
    for (i in daysOfWeek.keys) {
        println("$i - ${daysOfWeek[i]}")
    }

    val mutableDays = daysOfWeek.toMutableMap()
    mutableDays[5] = "22"
    mutableDays[4] = "Wed"
    println(mutableDays.toSortedMap())

    val fruitss = mapOf(
        "Ok" to Fruits("JackFruit", 20.0),
        "Fav" to Fruits("Stawberry", 90.0)
    )
    for (i in fruitss.keys) {
        println("$i - ${fruitss[i]?.name}")
    }
    println(fruitss.entries)
}

data class Fruits(val name: String, val price: Double)