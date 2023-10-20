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
    val obj1: Any = "This is string"
    if (obj1 !is String) {
        println("Not a string")
    } else {
        // obj1 is automatically cast to a String in this scope
        println("Found a string of length ${obj1.length}")
    }

    //Explicit (unsafe) Cast
    val str1: String = obj1 as String
    println(str1.length)

    // Unsafe Cast Example
    var obj2: Any = 12
//    var str2: String = obj2 as String
//    println(str2)  // throws error

    // Source and Target variable needs to be nullable for casting to work
    val obj4: Any? = "Stringggg"
    val str4: String? = obj4 as String?
    println(str4)

    // Safe Cast Example
    val location: Any = "Mumbai"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)

}