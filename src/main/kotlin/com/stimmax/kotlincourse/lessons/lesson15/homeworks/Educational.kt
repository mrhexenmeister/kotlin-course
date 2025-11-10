package org.example.com.stimmax.kotlincourse.lessons.lesson15.homeworks

abstract class EducationalInstitutions(
    val name: String
) {
}

abstract class BaseEducational(
    val level: String,
    val year: Int
) : EducationalInstitutions("Базовый класс") {
    open fun studyyear(): String {
        return when {
            year <= 9 -> "Общеобразовательная"
            year >= 11 -> "Средняя"
            else -> "Начальная"
        }
    }}
class School(val currentyear: Int): BaseEducational("Школа",currentyear){
    val study=studyyear()
}
open class University(val currentyear: Int): BaseEducational("Универ",currentyear){
    override fun studyyear(): String {
        return when {
            year ==5 -> "Бакалавр"
            year >=6 -> "Магистр"
            else -> "Отчислен"
        }
    }
    val study=studyyear()
}
class Administration(val status: String): University(25){
    val Tsar=currentyear
}

fun main() {
    val pupil= School(5)
    println("${pupil.study}")
    val student= University(4)
    println("${student.study}")
    val admin=Administration("Дед")
    println("Вы ${admin.status} находитесь у власти уже ${admin.Tsar} лет и порядком")
}