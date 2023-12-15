private fun Int.square() = this * this
class Squares(private val number: Int) {
    fun squareOfSum() = (1..number).sum().square()
    fun sumOfSquares() = (1..number).sumOf(Int::square)
    fun difference() = squareOfSum() - sumOfSquares()
}
