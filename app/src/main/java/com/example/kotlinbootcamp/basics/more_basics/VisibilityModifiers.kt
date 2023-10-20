package com.example.kotlinbootcamp.basics.more_basics

// Public - Visible to All
// Private - Visible within the block
// Protected - Visible in Base and Derived Classes
// Internal  - Visible within the module

open class Base {

    // Public by default
    var a = 1

    // Private to Base Class
    private var b = 2

    // Visible to Base and Derived Class
    protected open val c = 3

    // Visible inside the same module
    internal val d = 4
}

class Derived() : Base() {
// a,c,d and e of the Base Class are Visible
// b is not Visible

    // c is protected here also
    override val c = 9
}

fun main() {
    val base = Base()
    // base.a and base.d are visible
    // base.b and base.c are not visible

    val derived = Derived()
    // derived.c is not visible
}