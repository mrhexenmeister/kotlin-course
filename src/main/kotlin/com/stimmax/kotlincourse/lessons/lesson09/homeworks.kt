package org.example.com.stimmax.kotlincourse.lessons.lesson09

fun main() {
    println("Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.")
    val empty = arrayOf(1, 2, 3, 4, 5)
    println(empty.contentToString())
    println()

    println("Создайте пустой массив строк размером 10 элементов.")
    val empty1 = Array(10) {}
    println(empty1.contentToString())
    println()
    println(
        "Создайте массив из 5 элементов типа Double и заполните его значениями, " +
                "являющимися удвоенным индексом элемента."
    )
    val double = DoubleArray(5) { index -> index * 2.0 }
    println(double.contentToString())
    println()
    println(
        "Создайте массив из 5 элементов типа Int. " +
                "Используйте цикл, чтобы присвоить каждому элементу значение, " +
                "равное его индексу, умноженному на 3."
    )
    val int = IntArray(5) { index -> index * 3 }
    println(int.contentToString())
    println()
    println(
        "Создайте массив из 3 nullable строк. " +
                "Инициализируйте его одним null значением и двумя строками."
    )
    val nul = arrayOf<String?>(null, "", "")
    println(nul.contentToString())
    println()
    println("Создайте массив целых чисел и скопируйте его в новый массив в цикле.")
    val num1 = arrayOf<Int>()
    val num2 = arrayOf(num1.size)
    for (i in num1) {
        num2[i] = num1[i]
    }
    println(num2.contentToString())
    println()
    println(
        "Создайте два массива целых чисел одинаковой длины. " +
                "Создайте третий массив, вычев значения одного из другого. " +
                "Распечатайте полученные значения."
    )
    val num3 = intArrayOf(1, 2, 3, 4, 5)
    val num4 = intArrayOf(1, 2, 3, 4, 5)
    val num5 = IntArray(num3.size)
    for (i in num3.indices) {
        num5[i] = num3[i] - num4[i]
    }
    println(num5.contentToString())
    println()
    println(
        "Создайте массив целых чисел. Найдите индекс элемента со значением 5. " +
                "Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while."
    )
    val num6 = intArrayOf(1, 2, 3, 4, 6)
    var index = 0
    var index1 = -1
    while (index < num6.size) {
        if (num6[index] == 5) {
            index1 = index
            break
        }
        index++
    }
    println(index1)
    println()
    println(
        "Создайте массив целых чисел. Используйте цикл для перебора массива " +
                "и вывода каждого элемента в консоль. " +
                "Напротив каждого элемента должно быть написано “чётное” или “нечётное”."
    )
    val num7 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var index2 = 0
    while (index2 < num7.size) {
        val number5 = num7[index2]
        if (number5 % 2 == 1) {
            println("$index2 чет")
        } else {
            println("$index2 нечет")
        }
        index2++
    }
    println()
    println(
        "Создай функцию, которая принимает массив строк и строку для поиска. " +
                "Функция должна находить в массиве элемент, в котором принятая строка " +
                "является подстрокой (метод contains()). Распечатай найденный элемент."
    )
    val mass = arrayOf("раз", "два", "три", "четыре", "пять")
    val searchmass = "аз"
    fun searchsub(array: Array<String>, searchString: String) {
        for (letter in array) {
            if (letter.contains(searchString)) {
                println("нашлось $letter")
            }
        }

    }
    searchsub(mass, searchmass)
    println()
    println("Создайте пустой неизменяемый список целых чисел.")
    val readonly: List<Int> = listOf(1, 2, 3, 4)
    println(readonly)
    println()
    println(
        "Создайте неизменяемый список строк, содержащий три элемента " +
                "(например, Hello, World, Kotlin)."
    )
    val readonly1: List<String> = listOf("Hello", "World", "Kotlin")
    println(readonly1)
    println()
    println("Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.")
    val read: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(read)
    println()
    println("Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).")
    read.add(6)
    read.add(7)
    read.add(8)
    println(read)
    println()
    println("Имея изменяемый список строк, удалите из него определенный элемент (например, World).")
    val read1: MutableList<String> = mutableListOf("Hello", "New", "Wonderful", "World", "Peoples")
    read1.remove("World")
    println(read1)
    println()
    println("Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.")
    val listin: List<Int> = listOf(1, 2, 3, 4, 5)
    for (num11 in listin) {
        println(num11)
    }
    println()
    println("Создайте список строк и получите из него второй элемент, используя его индекс.")
    val read2: List<String> = listOf("One", "Two", "Three")
    println(read2[2])
    println()
    println("Имея изменяемый список чисел, измените значение элемента " +
            "на определенной позиции (например, замените элемент с индексом 2 на новое значение).")
    val munum: MutableList<Int> = mutableListOf(1,2,3,4,5)
    munum[2]=8
    println(munum)
    println()
    println("Создайте два списка строк и объедините их в один новый список, " +
            "содержащий элементы обоих списков. Реши задачу с помощью циклов.")
    val onelist: List<Int> = listOf(1,2,3)
    val twolist: List<Int> = listOf(4,5,6)
    val newlist = mutableListOf<Int>()
    for (num in onelist) {newlist.add(num)}
    for (num in twolist) {newlist.add(num)}
    println(newlist)
    println()
    println("Создайте список целых чисел и найдите в нем " +
            "минимальный и максимальный элементы используя цикл.")
    val numlist: List<Int> = listOf(1,2,3,4,5,6)
    val min = numlist.min()
    println(min)
    val max = numlist.max()
    println(max)

}

// Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
// Работа с Множествами Set
// Создайте пустое неизменяемое множество целых чисел.
// Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
// Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
// Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
// Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
// Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
// Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
// Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.