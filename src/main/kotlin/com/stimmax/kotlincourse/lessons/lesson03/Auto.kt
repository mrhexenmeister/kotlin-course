package org.example.ru.stimmax.kotlincourse.lessons.lesson3
const val wheels = 4
class Auto {
    val vincode: String = "1234"
    var color: String = "blue"
    var mileage: Int = 0
    lateinit var ownername: String
    val utilityreport: String by lazy {
       "sample text"
    }
}