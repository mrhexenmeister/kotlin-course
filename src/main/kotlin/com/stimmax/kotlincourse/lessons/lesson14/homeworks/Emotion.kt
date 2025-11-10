package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks

fun main() {
    val emotion=Emotion("Злость",10)
    emotion.express()
}
//Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию.
//У него должно быть свойство type (String) и intensity (Int).
//Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Вы испытываете эмоцию $type c интенсивностью $intensity")
    }
}