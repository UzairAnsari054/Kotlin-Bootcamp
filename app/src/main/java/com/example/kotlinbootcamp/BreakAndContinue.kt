package com.example.kotlinbootcamp

fun main() {
    for (i in 1 until 20) {
        if (i / 2 == 5) {
            break
        }
        print(i)
    }
    println()

    for (i in 1 until 20) {
        if (i / 2 == 5) {
            // skips 10 and 11 (10/2 = 5, 11/2 = 5.5 )
            continue
        }
        print(i)
    }
}