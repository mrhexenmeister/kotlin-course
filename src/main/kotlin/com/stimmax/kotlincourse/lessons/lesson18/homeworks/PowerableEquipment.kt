package org.example.com.stimmax.kotlincourse.lessons.lesson18.homeworks

abstract class PowerableEquipment : Powerable {
    protected var isPoweredOn: Boolean = false
        private set

    override fun powerOn() {
        println("Питание включается...")
        isPoweredOn = true
        println("Оборудование включено.")
    }

    override fun powerOff() {
        println("Питание выключается...")
        isPoweredOn = false
        println("Оборудование выключено.")
    }
}
