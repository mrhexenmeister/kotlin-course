package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks

//Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
//Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент,
//и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
//Добавьте метод showPhase(), который выводит текущую фазу Луны.
object Moon {
    var isVisible = true
    val phase = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println(phase)
        } else {
            println("Not visible")
        }
    }
}

fun main() {
    Moon.showPhase()
    Moon.isVisible=false
    Moon.showPhase()

}