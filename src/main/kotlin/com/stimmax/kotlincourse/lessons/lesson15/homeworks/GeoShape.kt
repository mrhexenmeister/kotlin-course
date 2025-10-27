package org.example.com.stimmax.kotlincourse.lessons.lesson15.homeworks

abstract class GeoShape(
    val name: String
) {
    abstract val dimension: Int //2d 3d
}

abstract class Circle(
    val radius: Double,
) : GeoShape("Круг") {
    override val dimension=2
    val diametr: Double
        get() = 2 * radius

}

abstract class Poligon(
    val sidescount: Int
) : GeoShape("Многоугольник") {
    override val dimension=2
    open fun calculateperimetr(): Double {
        return 0.0
    }
}

abstract class Triangle(
    val sidea: Double,
    val sideb: Double,
    val sidec: Double): Poligon(3){
    override fun calculateperimetr(): Double{
        return sidea + sideb + sidec
    }
}
abstract class Quadrangle(
    val sidea: Double,
    val sideb: Double,
    val sidec: Double,
    val sided: Double
): Poligon(4){
    override fun calculateperimetr(): Double {
        return sidea+sideb+sidec+sided
    }
}