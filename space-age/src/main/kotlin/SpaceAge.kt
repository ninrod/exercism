class SpaceAge(age: Long) {
    fun onEarth(): Double = 0.0
    fun onMercury(): Double = 0.0
    fun onVenus(): Double = 0.0
    fun onMars(): Double = 0.0
    fun onJupiter(): Double = 0.0
    fun onSaturn(): Double = 0.0
    fun onUranus(): Double = 0.0
    fun onNeptune(): Double = 0.0

   // Earth: orbital period 365.25 Earth days, or 31557600 seconds
   // Mercury: orbital period 0.2408467 Earth years
   // Venus: orbital period 0.61519726 Earth years
   // Mars: orbital period 1.8808158 Earth years
   // Jupiter: orbital period 11.862615 Earth years
   // Saturn: orbital period 29.447498 Earth years
   // Uranus: orbital period 84.016846 Earth years
   // Neptune: orbital period 164.79132 Earth years
}

fun main(args: Array<String>) {
    val age = SpaceAge(1000000)
    val v = age.onEarth()
    println("${v::class.qualifiedName}") // with package name or...    print()
}