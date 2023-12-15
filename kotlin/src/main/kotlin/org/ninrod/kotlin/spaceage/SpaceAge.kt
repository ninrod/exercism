package org.ninrod.kotlin.spaceage

import kotlin.math.round

class SpaceAge(val age: Long) {
    private fun roundify(squared: Double): Double = round(squared * 100) / 100
    fun onEarth(): Double = roundify(age/31557600.0)
    fun onMercury(): Double = roundify(onEarth() / 0.2408467)
    fun onVenus(): Double = roundify(onEarth() / 0.61519726)
    fun onMars(): Double = roundify(onEarth() / 1.8808158)
    fun onJupiter(): Double = roundify(onEarth() / 11.862615)
    fun onSaturn(): Double = roundify(onEarth() / 29.447498)
    fun onUranus(): Double = roundify(onEarth() / 84.016846)
    fun onNeptune(): Double = roundify(onEarth() / 164.79132)
}

fun main() {
    print(SpaceAge(1000000000).onEarth())
}
