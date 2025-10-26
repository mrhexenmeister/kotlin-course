package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks
fun main() {
val Party= party("Norilsk",10)
    Party.details()
}
//Событие: вечеринка. Создайте класс Party, который описывает вечеринку.
//У него должны быть свойства location (String) и attendees (Int).
//Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
class party (val location:String,val attendees:Int){
    fun details(){println("Place $location guest number $attendees")}
}

