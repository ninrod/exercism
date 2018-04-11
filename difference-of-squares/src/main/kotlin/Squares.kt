inline fun Int.square(): Int = this * this
class Squares(private val number: Int) {
    fun squareOfSum(): Int = (1..number).sum().square()
    fun sumOfSquares(): Int = (1..number).map { it.square() }.sum()
    fun difference(): Int = squareOfSum() - sumOfSquares()
}
