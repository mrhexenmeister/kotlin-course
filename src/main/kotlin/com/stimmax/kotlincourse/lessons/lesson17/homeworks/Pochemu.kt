package org.example.com.stimmax.kotlincourse.lessons.lesson17.homeworks
abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    private val privateVal: String,
//    Мы получаем доступ не к privateVal,
//а к новому публичному свойству privateVal, которое мы объявили в конструкторе ChildrenClass.
    // 2. объясни, почему это поле недоступно в main()
    protected val protectedVal: String,
    //Потому что у него модификатор protected.
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. объясни, почему эта функция не может быть публичной
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
//    Эта функция возвращает объект типа ProtectedClass.
//    Сам класс ProtectedClass объявлен как protected, то есть он виден только внутри BaseClass
//    и его наследников. Нельзя сделать видимым изначально скрытый компонент.
//    Скрыто одно, объявляем новое равное ему открытым - нельзя

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    //мы переопределили из дочернего эту функцию. Котлин вызывает функцию из наследника.
    // 9. объясни, почему эта функция не может быть публичной или protected
    // нельзя как и в 7 пункте. Если одно закрыто, то переопределить открыв уже нельзя.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}

class ChildrenClass(
    // Мы переопределяем privateVal родителя как публичное свойство самого ChildrenClass
    val privateVal: String, // Ключевое изменение для пункта 1
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    //унаследовали от родителя потому что
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // РЕШЕНИЕ ДЛЯ ПУНКТА 4
    override fun verifyPublicField(value: String): Boolean {
        // Переопределяем логику родителя, чтобы разрешить длинные строки
        return true
    }

    // РЕШЕНИЕ ДЛЯ ПУНКТА 5
    fun setProtected(newValue: String) {
        // Изнутри наследника мы ИМЕЕМ доступ к protected полям родителя
        this.protectedField = newValue
    }

    // Комментарий к пункту 6:
    // Мы не можем создать сеттер для privateField родителя,
    // так как ChildrenClass не имеет к нему никакого доступа. Это невозможно
    // без изменения BaseClass, что запрещено заданием.

    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    //унаследовали
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    //приватный метод который вызывает родительский принт. два названия в разных классах, одинаковые,
    // но вызывают разное.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}

fun main() {
    val child = ChildrenClass("доступен", "недоступен", "тоже доступен")

    // Решение и проверка для пунктов 3 и 4
    child.publicField = "Антонио Бандерас"

    // Решение и проверка для пункта 5
    child.setProtected("Новое значение для protected")

    // Проверка для пункта 8
    println("--- Результат вызова getAll() ---")
    println(child.getAll())
    println("----------------------------------\n")

    // Проверка для пункта 12
    println("--- Результат вызова printText() ---")
    child.printText()
    println("----------------------------------")
}