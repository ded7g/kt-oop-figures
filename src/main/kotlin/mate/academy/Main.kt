package mate.academy

import mate.academy.service.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val supplier = FigureSupplier()
    val list = Array(10) { i ->
        if (i < 5) supplier.getRandomFigure() else supplier.getDefaultFigure()
    }

    list.forEach { it.draw() }
}
