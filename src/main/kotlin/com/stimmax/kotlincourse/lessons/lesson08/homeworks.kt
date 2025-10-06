package org.example.com.stimmax.kotlincourse.lessons.lesson08

fun main() {
    //Правила проверки и преобразования:
    println("Задание - Это невозможно выполнить за один день")
    val example6 = "Это невозможно выполнить за один день"
    val result0 = example6.replace(
        "невозможно", "совершенно точно возможно просто требует времени"
    )
    println(result0)
    println()
    println("Задание - Я не уверен в успехе этого проекта")
    val example7 = "Я не уверен в успехе этого проекта"
    if (example7.startsWith("Я не уверен")) {
        val result2 = "$example7, но моя интуиция говорит об обратном"
        println(result2)
    }
    println()
    println("Задание - Произошла катастрофа на сервере")
    val example8 = "Произошла катастрофа на сервере"
    if (example8.contains("катастрофа")) {
        val result3 = example8.replace("катастрофа", "интересное событие")
            .replace("Произошла", "Произошло")
        println(result3)
    }
    println()
    println("Задание - Этот код работает без проблем")
    val example9 = "Этот код работает без проблем"
    if (example9.endsWith("без проблем")) {
        val result4 = example9.replace(
            "без проблем", "с парой интересных вызовов на пути"
        )
        println(result4)
    }
    println()
    println("Задание - Удача")
    val example10 = "Удача"
    val words = example10.contains(" ")
    if (words == false) {
        val result = example10.replace("Удача", "удача")
        println("Иногда, $result, но не всегда")
    }
    println()
    println("Задание - Пользователь вошел в систему -> 2021-12-01 09:48:23")
    val example11 = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val datetime = example11.indexOf("-> ")
    val datetime1 = example11.substring(datetime + 3)
    val datetime2 = datetime1.split(" ")
    println(datetime2[0])
    println(datetime2[1])
    println()
    println(
        "Задание - Дана строка с номером кредитной карты, например 4539 1488 0343 6467. " +
                "Замаскируйте все цифры, кроме последних четырех, символами *"
    )
    val cardnumber = "4539 1488 0343 6467"
    val last4 = cardnumber.split(" ")
    val last5 = last4[3]
    println("**** **** **** $last5")
    println()
    println(
        "Задание - У вас есть электронный адрес, например username@example.com. " +
                "Преобразуйте его в строку username [at] example [dot] com, используя функцию replace()"
    )
    val mail = "username@example.com"
    val at = mail.replace("@", " [at] ").replace(".", " [dot] ")
    println(at)
    println()
    println(
        "Задание - Дан путь к файлу, например C:/Пользователи/Документы/report.txt" +
                " или D:/good.themes/dracula.theme (может быть любым). " +
                "Извлеките название файла с расширением."
    )
    val text = "D:/good.themes/dracula.theme"
    val revtext = text.reversed()
    val spl = revtext.split("/")
    val unrevtext = spl[0].reversed()
    println(unrevtext)
    println("простой способ")
    val text1 = "C:/Пользователи/Документы/report.txt"
    val lasttxt = text1.substringAfterLast("/")
    println(lasttxt)
    println()
    println(
        "Задание - У вас есть фраза, например Котлин лучший язык программирования " +
                "Создайте аббревиатуру из начальных букв слов (например, ООП)."
    )
    val phrase =
        "Желание освоить программирование автоматически порождает " +
                "объемные линии новых аналитических ясловонеподобрал"
    val spl1 = phrase.split(" ")
    var abbrev = ""
    for (word in spl1) {
        val letter1 = word[0].uppercase()
        abbrev += letter1
    }
    println(abbrev)
}
