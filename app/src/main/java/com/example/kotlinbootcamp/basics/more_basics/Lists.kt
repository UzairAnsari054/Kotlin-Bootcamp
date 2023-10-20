package com.example.kotlinbootcamp.basics.more_basics

fun main() {
    val months = listOf("Jan", "Feb", "Mar")
    
    val mutableMonths = months.toMutableList()
    val newMonths = arrayOf("Apr", "May", "Jun")
    mutableMonths.addAll(newMonths)
    println(mutableMonths)

    val days = mutableListOf("Mon", "Tue", "Wed")
    days.add(0,"Thrus")
//    days[1] = "No Mon"
//    days.removeAt(2)
    val removeList = mutableListOf("Tue", "Wed")
    days.removeAll(removeList)
    println(days)

}