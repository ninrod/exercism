private fun Int.isDivisibleBy(i: Int) = this % i == 0
private fun Char.int() = this.toString().toInt()
private fun Char.luhn() = (this.int() * 2).let { if (it > 9) it - 9 else it }
object Luhn {
    fun isValid(a: String): Boolean {
        val s = a.replace(" ", "")
        when {
            s.isEmpty() -> return false
            s.length < 2 -> return false
            s.toLongOrNull() == null -> return false
        }
        return s.reversed()
                .mapIndexed { i, c -> if (i.isDivisibleBy(2)) c.int() else c.luhn() }
                .sum().isDivisibleBy(10)
    }
}
