package org.example.com.stimmax.kotlincourse.lessons.lesson18.homeworks

abstract class ProgrammableEquipment : PowerableEquipment(), Programmable {

    protected var currentAction: String? = null

    override fun programAction(action: String) {
        currentAction = action
        println("Задана программа: $action")
    }

    override fun execute() {

        if (isPoweredOn) {
            if (currentAction != null) {
                println("Выполняется программа: $currentAction")
            } else {
                println("Программа не задана.")
            }
        } else {
            println("Ошибка: Оборудование выключено. Невозможно выполнить программу.")
        }
    }
}