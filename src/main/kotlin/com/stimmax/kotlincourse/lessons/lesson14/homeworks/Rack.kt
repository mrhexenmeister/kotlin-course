package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks

//Какой-то бесконечный трэш. Вроде проходили все, но ничего в кучу не складывается ни разу.
//Класс Rack (Стеллаж)
//
//Характеристики:
//
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.
class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    //    Добавление Полки (addShelf):
//    Добавляет новую полку в стеллаж.
//    Возвращает true, если полка была успешно добавлена
//    или false если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.contains(shelf) || shelves.size == maxShelves) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    //    Удаление Полки (removeShelf):
//    Принимает индекс полки для удаления.
//    Удаляет полку по указанному индексу.
//    Возвращает список предметов полки, если полка
//    была успешно удалена или пустой список если полка не существует.
    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val items = shelves[index].getItems()
        shelves.removeAt(index)
        return items
    }

    //    Добавление Предмета (addItem):
//    Добавляет предмет на первую свободную полку.
//    Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
   // fun addItem(item: String) {
     //   if ()
   // }

}