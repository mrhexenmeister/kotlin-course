package org.example.com.stimmax.kotlincourse.lessons.lesson10

fun main() {
    println("Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.")
    val unit1 = mapOf<Int, Int>(1 to 1, 2 to 1)
    println(unit1)
    println(
        "Создайте словарь, " +
                "инициализированный несколькими парами ключ-значение, где ключи - float, а значения - double"
    )
    val unit2 = mapOf<Float, Double>(0.1f to 1.1, 0.2f to 1.3)
    println(unit2)
    println()
    println("Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.")
    val unit3 = mutableMapOf<Int, String>(1 to "One", 2 to "Two")
    println(unit3)
    println()
    println("Имея изменяемый словарь, добавьте в него новые пары ключ-значение.")
    unit3[3] = "Three"
    println(unit3)
    println()
    println(
        "Используя словарь из предыдущего задания, извлеките значение, используя ключ. " +
                "Попробуй получить значение с ключом, которого в словаре нет."
    )
    println(unit3[1])
    println(unit3[4])
    println()
    println("Удалите определенный элемент из изменяемого словаря по его ключу.")
    unit3.remove(1)
    println(unit3)
    println()
    println(
        "Создайте словарь (ключи Double, значения Int) " +
                "и выведи в цикле результат деления ключа на значение. " +
                "Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)"
    )
    val unit4 = mapOf<Double, Int>(0.1 to 2, 0.2 to 3, 0.3 to 0)
    var unit4i1: Double = 0.0
    for ((double, int) in unit4) {
        if (int == 0) {
            println("бесконечность")
            break
        }
        unit4i1 = double / int
    }
    println(unit4i1)
    println()
    println("Измените значение для существующего ключа в изменяемом словаре.")
    unit3[1] = "ten"
    println(unit3[1])
    println("Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.")
    val unit5 = mutableMapOf<Int, Int>(1 to 2, 2 to 3)
    val unit6 = mutableMapOf<Int, Int>(4 to 2, 3 to 4)
    val unit7 = mutableMapOf<Int, Int>()
    for ((int1, int2) in unit5) {
        unit7[int1] = int2
    }
    for ((int1, int2) in unit6) {
        unit7[int1] = int2
    }
    println(unit7)
    println()
    println(
        "Создайте словарь, где ключами являются строки, " +
                "а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь."
    )
    val unit8 = mutableMapOf<String, List<Int>>()
    unit8["one"] = listOf(1)
    unit8["two"] = listOf(1, 2, 3)
    println(unit8)
    println()
    println(
        "Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. " +
                "Добавь данные в словарь. Получи значение по ключу " +
                "(это должно быть множество строк) и добавь в это множество ещё строку. " +
                "Распечатай полученное множество."
    )
    val unit9 = mutableMapOf<Int, MutableSet<String>>()
    unit9[1] = mutableSetOf("one", "two")
    println(unit9[1])
    unit9[2] = mutableSetOf("three")
    println(unit9)
    println()
    println(
        "Создай словарь, где ключами будут пары чисел. " +
                "Через перебор найди значение у которого пара будет содержать цифру 5 " +
                "в качестве первого или второго значения."
    )
    val unit10 = mapOf((1 to 2) to 10, (2 to 3) to 20, (3 to 5) to 30)
    for ((key, value) in unit10) {
        if (key.first == 5 || key.second == 5) println("$key - $value")
    }
    println()
    println("Задачи на подбор оптимального типа для словаря")
    println("Словарь библиотека: Ключи - автор книги, значения - список книг")
    val biblio = mutableMapOf<String, MutableList<String>>()
    biblio["Дюма"] = mutableListOf("Три мушкетера", "Две дианы")
    biblio["Конан Дойль"] = mutableListOf("Этюд в багровых тонах", "Его прощальный поклон")
    println(biblio)
    println()
    println(
        "Справочник растений: " +
                "Ключи - типы растений (например, Цветы, Деревья), значения - списки названий растений"
    )
    val flora = mutableMapOf<String, MutableList<String>>()
    flora["Цветы"] = mutableListOf("Роза", "Азор")
    flora["Деревья"] = mutableListOf("Дуб", "Вяз")
    println(flora)
    println()
    println("Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды")
    val quarter =
        mapOf<String, List<String>>("Зенит" to listOf("Ярмак", "Задорнов"), "Спартак" to listOf("Емеля", "Дурнеев"))
    println(quarter)
    println()
    println("Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату")
    val ambulance = mutableMapOf<Triple<Int, Int, Int>, MutableList<String>>()
    ambulance[Triple(10, 20, 23)] = mutableListOf("Аспирин", "Анальгин")
    println(ambulance)
    println()
    println(
        "Словарь путешественника: Ключи - страны, значения - " +
                "словари из городов со списком интересных мест."
    )
    val diction = mutableMapOf<String, MutableList<String>>()
    diction["Россия"]=mutableListOf("Воронеж","Колыма","Сибирь")
    println(diction)
}