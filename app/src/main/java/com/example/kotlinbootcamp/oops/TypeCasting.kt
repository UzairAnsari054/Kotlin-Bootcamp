package com.example.kotlinbootcamp.oops

import kotlin.math.floor

fun main(){
    val straightList = listOf("Goat", "Bull", "Sheep")
    val mixedList = listOf("Titanic", 3, 1.4)

   for (i in mixedList){
       when(i) {
           is Int -> println("$i is Integer")
           is Double -> println("$i is Double and Floor value is ${floor(i)}")
           is String -> println("$i is String")
           else -> println("Wrong type")
       }
   }

    //Smart Cast
    var obj1: Any = "This is string"
    if (obj1 !is String) {
        println("Not a string")
    } else {
        // obj1 is automatically cast to a String in this scope
        println("Found a string of length ${obj1.length}")
    }

    //Explicit (unsafe) Cast
    var str1: String = obj1 as String
    println(str1.length)

    //unsafe cast example
    var obj2: Any = 12
    var str2: String = obj2 as String
    println(str2)  // throws error

    // safe cast example
    var obj3: Any = 12
    var str3: String? = obj3 as? String
    println(str3)  // null
}