package org.example.com.stimmax.kotlincourse.lessons.lesson06
fun main()
{example1 (12)
ex2 (10, true)}

fun example1(arg: Int) {
    when (arg) {
        in 0..5 -> println("night")
        in 6..11 -> println("morning")
        in 12..17 -> println("afternoon")
        in 18..23 -> println("evening")
        else -> println("time is incorrect")
    }
}

fun ex2(arg1: Int, arg2: Boolean) {
    if (arg1 > 30 || arg1 < -5) {
        println("take a car")
    } else if (arg1 >= 15 && !arg2) {
        println("have a walk")
    } else {
        println("take a bus")
    }
}