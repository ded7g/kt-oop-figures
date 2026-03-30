package mate.academy.service

import mate.academy.model.Color
import kotlin.random.Random

open class ColorSupplier {
    open fun getRandomColor(): Color {
        return Color.values()[Random.nextInt(Color.values().size)]
    }
}
