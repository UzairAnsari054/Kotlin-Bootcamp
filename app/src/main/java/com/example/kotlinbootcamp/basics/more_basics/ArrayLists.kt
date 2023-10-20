package com.example.kotlinbootcamp.basics.more_basics

// ArrayLists are used to create dynamic arrays, means the size of an ArrayList
// can be increased or decreased according to the requirement
// ArrayLists provides Read and Write functionalities
// ArrayLists follows Sequence of Insertion Order, means it matters when you put something in there
// ArrayLists is non-synchronized and it may contain duplicate elements

// ArrayList() - Used to create empty ArrayList
// ArrayList(capacity: Int) - Used to create ArrayList of specified capacity
// ArrayList(elements: Collection<E>) - Used to create ArrayList filled with elements of collections

fun main() {

    val arrayList = ArrayList<String>(5)
    val list = mutableListOf<String>()
    list.add("One")
    list.add("Two")
    arrayList.addAll(list)

    val itr = arrayList.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }
    println(arrayList.size)

    val numbersArray = ArrayList<Double>(5)
    val addList = mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0)
    numbersArray.addAll(addList)

//    val avg = numbersArray.average()
    var total = 0.0
    for (i in numbersArray) {
        total += i
    }
    val avg = total / numbersArray.size
    println(avg)

}
