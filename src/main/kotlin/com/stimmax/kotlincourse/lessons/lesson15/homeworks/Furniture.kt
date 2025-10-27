package org.example.com.stimmax.kotlincourse.lessons.lesson15.homeworks

import org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks.Shelf

abstract class Furniture(val type: String) {
}

open class Bedroom(val name: String) : Furniture("Мебель") {
}

class Closet(val shelf: Int) : Bedroom("Шкаф") {
    fun lenght(): String {
        return when {
            shelf < 3 -> "Small"
            shelf < 5 -> "Normal"
            else -> "Bigbrother"
        }
    }
}

class Bedside(val item: Int) : Bedroom("ТумбаЮмба") {
    fun quantity(): Int {
        return when (item){
            1-> 1
            2->2
            else -> 0
        }
    }
}