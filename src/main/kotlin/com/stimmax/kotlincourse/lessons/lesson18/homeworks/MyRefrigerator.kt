package org.example.com.stimmax.kotlincourse.lessons.lesson18.homeworks

class MyRefrigerator : TempAndOpenableEquipment(), LightEmitting {

    override val maxTemperature: Int = 10
    val capacity: Int = 250

    var currentTemperature: Int = 5

    override fun setTemperature(temp: Int) {
        if (isPoweredOn) {
            if (temp in 0..maxTemperature) {
                currentTemperature = temp
                println("Температура в холодильнике установлена на $currentTemperature°C")
            } else {
                println("Недопустимая температура.")
            }
        } else {
            println("Холодильник выключен. Невозможно установить температуру.")
        }
    }

    override fun open() {
        println("Дверь холодильника открыта.")
        emitLight() // Когда открываем дверь, зажигается свет
    }

    override fun close() {
        println("Дверь холодильника закрыта.")
        completeLiteEmission() // Когда закрываем, свет гаснет
    }

    override fun emitLight() {
        println("Лампочка внутри холодильника зажглась.")
    }

    override fun completeLiteEmission() {
        println("Лампочка внутри холодильника погасла.")
    }
}
