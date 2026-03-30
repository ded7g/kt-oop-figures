package mate.academy.service

import mate.academy.model.Color
import kotlin.math.PI

abstract class Figure(color: Color) {
    abstract fun area(): Double
    abstract fun draw()
}

open class Circle(val radius: Double,val color: Color) : Figure(color) {
    override fun area(): Double {
        return PI * radius * radius
    }
    override fun draw() {
        println("Figure: circle, area: ${area()} sq. units, radius: $radius units, color: $color")
    }
}
open class RightTriangle(val firstleg: Double, val secondleg: Double, val color: Color) : Figure(color) {
    override fun area(): Double {
        return 0.5 * firstleg * secondleg
    }
    override fun draw() {
        println("Figure: rightTriangle, area: ${area()} sq. units, firstLeg: $firstleg units, secondLeg: $secondleg units, color: $color")
    }
}
class Square(val side: Double,val color: Color) : Figure(color) {
    override fun area(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${area()} sq. units, side: $side, color: $color")
    }
}
class Rectangle(val width: Double, val height: Double, val color: Color) : Figure(color) {
    override fun area(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${area()} sq. units, width: $width, height: $height, color: $color")
    }
}
class IsoscelesTrapezoid(val topBase: Double, val bottomBase: Double, val height: Double, val color: Color) : Figure(color) {
    override fun area(): Double = ((topBase + bottomBase) / 2) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${area()} sq. units, topBase: $topBase, bottomBase: $bottomBase, height: $height, color: $color")
    }
}