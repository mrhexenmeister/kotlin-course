package org.example.com.stimmax.kotlincourse.lessons.lesson18.homeworks

fun main() {
    println("--- Тестируем Холодильник ---")
    val fridge = MyRefrigerator()
    fridge.setTemperature(2) // Попытка установить температуру на выключенном
    fridge.powerOn()
    fridge.setTemperature(3)
    fridge.open()
    fridge.close()
    fridge.powerOff()
    println()

    println("--- Тестируем Стиральную машину ---")
    val washingMachine = MyWashingMachine()
    washingMachine.connectToWaterSupply()
    washingMachine.connectToDrain()

    washingMachine.programAction("Хлопок 40°")
    washingMachine.execute() // Не сработает, т.к. выключена

    washingMachine.powerOn()
    washingMachine.close() // Закрываем люк перед стиркой
    washingMachine.execute() // Теперь сработает
    washingMachine.drain()
    washingMachine.powerOff()
}