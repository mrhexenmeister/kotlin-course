package org.example.com.stimmax.kotlincourse.lessons.lesson10

import kotlin.io.println

fun main() {
    val pair = 1 to "a"
    val emptyMap: Map<String, Int> = mapOf<String, Int>()
    val capitals: Map<String, String> = mapOf("" to "", "" to "")
    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b")
    val mutablecapitals: MutableMap<String, String> = mutableMapOf("россия" to "москва")

    val a1 = mapOf<String, Int>("one" to 1, "two" to 2)
    val a2 = mutableMapOf<String, String>("Korea" to "Seoul")
    a2["Japan"] = "Tokyo"

    a2.remove("Korea")
    for ((Country, City) in a2) {
        println("$Country + $City")
    }
    a2["Russia"]="Moscow"
    mapKey(a2, "Japan")
    if ("Russia" in a2){
        println(a2["Russia"])
    }
    else {println("not found")}

    a2["Russia"]="Novosibirsk"

    val schedule = mapOf<String, MutableList<String>>()

}

fun mapKey(map: Map<String, String>, key: String) {
    for ((k, v) in map) {
        if (key == k) {
            println(v)
            return
        }
    }
    println ("key not found")}