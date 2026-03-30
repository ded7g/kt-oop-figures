package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.FigureType
import kotlin.random.Random

open class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getDefaultFigure() : Figure {
        return Circle(10.0, Color.WHITE)
    }
    fun getRandomFigure():Figure {
        val color = colorSupplier.getRandomColor()
        return when (FigureType.values()[Random.nextInt(FigureType.values().size)]) {
            FigureType.CIRCLE -> Circle(Random.nextDouble(1.0, 20.0), color)
            FigureType.RIGHTTRIANGLE -> RightTriangle(Random.nextDouble(1.0,20.0), Random.nextDouble(1.0,20.0), color)
            FigureType.SQUARE -> Square(Random.nextDouble(1.0, 20.0), color)
            FigureType.RECTANGLE -> Rectangle(Random.nextDouble(1.0,20.0), Random.nextDouble(1.0,20.0), color)
            FigureType.ISOSCELESTRAPEZOID -> IsoscelesTrapezoid(Random.nextDouble(1.0,20.0), Random.nextDouble(1.0,20.0), Random.nextDouble(1.0,20.0), color)
        }
    }
}