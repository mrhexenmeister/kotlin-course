package org.example.com.stimmax.kotlincourse.lessons.lesson15.homeworks

import kotlin.math.max

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class InsertFirstmaterials : Materials() {
    fun insert(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach { addMaterial(it) }
    }
}

//Второй класс должен получать список строк и вставлять
//их в начало контейнера, но поочерёдно с теми данными, которые уже есть.
//То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
class InsertOneByOne : Materials() {
    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = max(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.count()) {
                addMaterial(items[i])
            }
            if (i<materials.count()){
                addMaterial(materials[i])
            }

        }
    }
}