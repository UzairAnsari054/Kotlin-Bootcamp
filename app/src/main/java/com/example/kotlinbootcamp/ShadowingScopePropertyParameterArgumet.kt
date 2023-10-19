package com.example.kotlinbootcamp

fun main(){

    //Here name Variable
    val name = ""

    //Here name is a Property of Class ABC
    class ABC(name: String)

    //Here name is a Parameter of Function xyz
    fun xyz(name: String){}

    //Here both name are Argument
    ABC(name = "")
    xyz(name = "")


    //Shadowing:
    // Here variable a is shadowed as same name parameter is defined in the function
    // Shadowing should be avoided as it decreases readability & you can't acces the original variable
    // with in a scope
    fun myFunction(a: Int){
        var a = 5
        println(a)
    }

    //Scope
    // You can access a variable or anything with in a scope only unless its Public or Global.

}