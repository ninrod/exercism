enum class Classification { DEFICIENT, PERFECT, ABUNDANT }
private fun Int.aliquotSum() = (this/2 downTo 1).filter { this % it == 0 }.sum()
private fun Int.aliquotClassify(): Classification {
    val s = this.aliquotSum()
    return when {
        s > this -> Classification.ABUNDANT
        s < this -> Classification.DEFICIENT
        else ->  Classification.PERFECT
    }
}
fun classify(n: Int): Classification {
    require(n > 0) { "natural numbers are greater than zero" }
    return n.aliquotClassify()
}
