package org.example.com.stimmax.kotlincourse.lessons.lesson07

fun main() {
    // Напишите цикл for, который выводит числа от 1 до 5.
    println("раз")
    for (i in 1..5)
        println(i)
    println("два")
    // Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10)
        if (i % 2 == 0)
            println(i)
    println("три")
    // Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1)
        println(i)
    println("четыре")
    // Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1)
        if ((10 - i) % 2 == 0) {
            println(i)
        }
    println("пять")
    // Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 9 downTo 1 step 2)
        println(i)
    println("шесть")
    // Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3)
        println(i)
    println("семь")
    // Создайте числовую переменную 'size'.
    // Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size: Int = 10
    for (i in 3 until size step 2)
        println(i)
    println("восемь")
    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var quad = 0
    while (quad++ < 5) {
        println(quad * quad)
    }
    println("девять")
    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var num = 10
    while (num >= 5) {
        println(num)
        num--
    }
    println("десять")
    //Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var counter = 5
    do println(counter)
    while (counter-- > 1)
    println("одиннадцать")
    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter1 = 5
    do println(counter1)
    while (counter1++ < 9)
    println("двенадцать")
    // Использование break
    // Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10)
    { if (i==6) break
    println(i)}
    println("тринадцать")
    // Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var numbe=1
    while (numbe>0)
    {println(numbe)
        numbe++
    if (numbe==11) break}
    println("четырнадцать")
    // Использование continue
    // В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10)
    {if (i%2==0) continue
        println(i)}
    println("пятнадцать")
    // Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var e15=1
    while (e15<=10)
    {if (e15%3==0) {e15++
        continue}
        println(e15)
    e15++
        }

}
