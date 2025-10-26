package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks

//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.
class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    //Добавление Предмета (addItem):
//Принимает название предмета.
//Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
//Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
    fun additems(name: String): Boolean {
        if (!canAccomodate(name)) {
            return false
        }
        items.add(name)
        return true
    }

    //Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
    fun removeItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }
        items.remove(name)
        return true
    }

    //Проверка Вместимости (canAccommodate):
//Принимает название предмета.
//Определяет, вместится ли предмет на полку.
//Возвращает true, если предмет вместится, и false, если места недостаточно.
    fun canAccomodate(name: String): Boolean {
        val currentaccomodation= items.sumOf { it.length }
        return currentaccomodation + name.length < capacity
    }

    //Проверка наличия предмета (containsItem):
//Принимает название предмета
//Возвращает true если такой предмет есть
    fun containsItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }
        return true
    }

    //Получение списка предметов (getItems):
//Возвращает неизменяемый список предметов
    fun getItems() = items.toList()
}

