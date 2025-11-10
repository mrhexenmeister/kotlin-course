package org.example.com.stimmax.kotlincourse.lessons.lesson18.homeworks

class MyWashingMachine : ProgrammableEquipment(), Openable, WaterContainer, WaterConnection,
    Drainable {
    override val capacity: Int = 7 // кг белья

    override fun open() = println("Люк стиральной машины открыт.")
    override fun close() = println("Люк стиральной машины закрыт.")

    override fun fillWater(amount: Int) {
        if(isPoweredOn) println("Набираем $amount л воды.") else println("Машина выключена.")
    }

    override fun getWater(amount: Int) {
        if(isPoweredOn) println("Сливаем $amount л воды.") else println("Машина выключена.")
    }

    override fun connectToWaterSupply() = println("Стиральная машина подключена к водопроводу.")
    override fun connectToDrain() = println("Сливной шланг подключен к канализации.")
    override fun drain() = println("Производится полный слив воды.")
}