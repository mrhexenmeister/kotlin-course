package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks

//Мероприятие: концерт. Создайте класс, который будет представлять концерт.
//У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
//Также приватное поле “проданные билеты”.
//Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
//который увеличивает количество проданных билетов на один.
class Concert(
    var Group: String = "",
    var Place: String,
    val cost: Int,
    val capacity: Int
) {
    private var soldticket: Int = 0
    fun ConcertInfo() {
        println(" Концерт группы ${Group} в $Place, стоит $cost, осталось билетов ${capacity-soldticket}")
    }

    fun BuyTicket() {
        if (soldticket < capacity)
            soldticket++
        }
    }

fun main() {
    var concert= Concert("Lala","DOOM",1000,10)
    concert.BuyTicket()
    concert.BuyTicket()
    concert.BuyTicket()
    concert.ConcertInfo()
}
