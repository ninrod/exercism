private fun Int.isDivisibleBy(i: Int) = this % i == 0
private fun Int.isEven() = this.isDivisibleBy(2)
private fun Char.int() = this.toString().toInt()
private fun Int.luhn() = (this * 2).let { if (it > 9) it - 9 else it }

object Luhn {
    fun isValid(a: String): Boolean {
        val s = a.replace(" ", "")
        when {
            s.isEmpty() -> return false
            s.length < 2 -> return false
            s.toLongOrNull() == null -> return false
        }
        return s.reversed()
                .mapIndexed { i, c -> if (i.isEven()) c.int() else c.int().luhn() }
                .sum().isDivisibleBy(10)
    }
}

fun main(args: Array<String>) {
    println(6.luhn())
}
