package org.example.com.stimmax.kotlincourse.lessons.lesson14.homeworks
//Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине.
//У него должны быть свойства “название”, “цена”, “количество”.
data class Product(
    val name: String,
    var cost: Int,
    var value: Int
)

fun main() {
    val buy= Product("Apple",125,10)
    val buy1="Product ${buy.name} cost ${buy.cost} for ${buy.value} items"
    println(buy1)
}
