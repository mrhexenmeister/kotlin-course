package org.example.com.stimmax.kotlincourse.lessons.lesson13

fun main() {
//    Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.
//
//    Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
//    Определите среднее время выполнения теста.
    val vol1 = mapOf("Yksi" to 20, "Kaksi" to 30, "Nelja" to 40)
    val average = vol1.values.average()
    println(average)
//    Имеется словарь с метаданными автоматизированных тестов,
//    где ключи — это имена тестовых методов а значения - строка с метаданными.
//    Выведите список всех тестовых методов.
    val vol2 = mapOf("One" to "12.12.22", "Two" to "123.32.33")
    val list = vol2.keys
    println(list)
//    В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val vol3 = mutableMapOf("One" to 5, "two" to 3, "three" to 4)
    val test = vol3 + ("four" to 3)
    println(test)
//    Посчитайте количество успешных тестов в словаре с результатами
//    (ключ - название, значение - результат из passed, failed, skipped).
    val vol4 = mapOf("1" to "passed", "2" to "skipped", "3" to "failed", "4" to "passed")
    val pass = vol4.values.count { it == "passed" }
    println(pass)
//    Удалите из изменяемого словаря с баг-трекингом запись о баге,
//    который был исправлен (ключ - название, значение - статус исправления).
    val vol5 = mutableMapOf("One" to "accept", "two" to "failed", "Three" to "accept")
    val del = vol5.remove("Three")
    println(vol5)
//    Для словаря с результатами тестирования веб-страниц
//    (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val vol6 = mapOf("https://stimmax.ru/lesson/rabota-so-slovaryami" to "Online", "https://stimmax.ru" to "Online")
    for ((key, value) in vol6) {
        println("Key: $key, value: $value")
    }
//    Найдите в словаре с названием и временем ответа сервисов только те,
//    время ответа которых превышает заданный порог.
    val vol7 = mapOf("https://stimmax.ru" to 120, "https://max.ru" to 20, "https://stim.ru/" to 30)
    val timing = vol7.filterValues { it > 20 }
    println(timing)
//    В словаре хранятся результаты тестирования API
//    (ключ — endpoint, значение — статус ответа в виде строки).
//    Для указанного endpoint найдите статус ответа, если endpoint отсутствует,
//    предположите, что он не был протестирован.
    val apiTestResults = mapOf(
        "/api/v1/users/login" to "200 OK",
        "/api/v1/data/fetch" to "503 Service Unavailable",
        "/api/v1/report/generate" to "201 Created",
        "/api/v1/legacy/endpoint" to "404 Not Found"
    )
    val endpoints = apiTestResults.getOrElse("/api/v1/users/logi") { "Not tested" }
    println(endpoints)
//    Из словаря, содержащего конфигурации тестового окружения
//    (ключ — название параметра конфигурации, значение - сама конфигурация),
//    получите значение для "browserType". Ответ не может быть null.
    val simpleTestConfig = mapOf(
        "URL" to "https://my.com",
        "TimeoutMs" to "5000",
        "Environment" to "Production",
        "browserType" to "Chrome"
    )
    val browser = simpleTestConfig.getValue("browserType")
    println(browser)
//    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val simpleVersions = mapOf(
        "MobileApp" to "1.5.0",
        "BackendAPI" to "2.1"
    )
    val simpleVersions1 = simpleVersions + mapOf("Portable" to "1.2.3")
    println(simpleVersions1)
//    Используя словарь с настройками тестирования для различных мобильных устройств
//    (ключ — модель устройства, значение - строка с настройками),
//    получите настройки для конкретной модели или верните настройки по умолчанию.
    val MobileDevices = mapOf(
        "iPhone X" to "OS: iOS 14",
        "Galaxy S9" to "OS: Android 11",
        "iPad Mini" to "Tablet, Landscape"
    )
    val MobileDevices1 = MobileDevices.getOrDefault("iPhone X", "iOS 12")
    println(MobileDevices1)
//    Проверьте, содержит ли словарь с ошибками тестирования
//    (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val testErrorCodes = mapOf(
        1001 to "Ошибка подключения к базе",
        1002 to "Тайм-аут API",
        400 to "Неверный запрос (Bad Request)"
    )
    val Codes = testErrorCodes.getValue(1001)
    println(Codes)
//    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version"
//    , а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
//    Отфильтруйте словарь, оставив только те сценарии,
//    идентификаторы которых соответствуют определённой версии тестов,
//    то-есть в ключе содержится требуемая версия.
    val testExecutionResults = mapOf(
        "AUTH1_001" to "Passed",
        "AUTH2_002" to "Failed",
        "AUTH3_003v1" to "Skipped",
        "AUTH4_004v2" to "Passed"
    )
    val filtered = testExecutionResults.filterKeys { it.contains("v2") }
    println(filtered)
//    У вас есть словарь, где ключи — это названия функциональных модулей приложения,
//    а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val simpleModuleStatus = mapOf(
        "Login" to "OK",
        "Cart" to "Fail",
        "Checkout" to "Pending"
    )
    val filtersmodule = simpleModuleStatus.filterValues { it.contains("Fail") }
    println(filtersmodule)
//    Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val simpleSettings = mutableMapOf(
        "Среда" to "Staging",      // Какая среда используется
        "Браузер" to "Chrome",     // Какой браузер
        "Размер_окна" to "FullHD"  // Размер окна или разрешение
    )
    val simpeSettings = simpleSettings + simpleModuleStatus
    println(simpeSettings)
//    Объедините два неизменяемых словаря с данными о багах.
    val vol10 = mapOf("One" to "accept", "two" to "failed", "Three" to "accept")
    val vol11 = mapOf("four" to "accept", "five" to "failed", "six" to "accept")
    val bag = vol10 + vol11
    println(bag)
//    Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val lastRunSummary = mutableMapOf(
        "total_tests" to 150,
        "tests_passed" to 142,
        "tests_failed" to 8,
        "tests_skipped" to 0
    )
    val clear = lastRunSummary.clear()
    println(clear)
//    Исключите из отчета по автоматизированному тестированию те случаи,
//    где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val simpleTestReport = mapOf(
        "Глобальный_статус" to "skipped",
        "Дата_прогона" to "2024-10-20",
        "Всего_тестов" to "150",
        "Провалено_тестов" to "8"
    )
    val removereport = simpleTestReport.filterNot { it.value == "skipped" }
    println(removereport)
//    Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val copyoftestrep = simpleTestReport.toMutableMap()
    val copyofdel = copyoftestrep - "Всего_тестов" - "Провалено_тестов"
    println(copyofdel)
//    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//    (ключ — идентификатор теста, значение — результат)
//    в список строк формата "Test ID: результат".
    val stringtest=simpleTestReport.entries.joinToString{"${it.key} : ${it.value}"}
    println(stringtest)
//    Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
//    Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
//    Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
//    Проверьте, пуст ли словарь с ошибками компиляции тестов.
//    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
//    Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
//    Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
//    Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
}