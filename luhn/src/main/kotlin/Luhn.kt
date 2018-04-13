object Luhn {
    private fun Int.isDivisibleBy(i: Int) = this % i == 0
    private fun Int.isEven() = this.isDivisibleBy(2)
    fun isValid(a: String): Boolean {
        val s = a.replace(" ", "")
        when {
            s.isEmpty() -> return false
            s.length < 2 -> return false
            s.toLongOrNull() == null -> return false
        }
        return s.reversed().mapIndexed { i, c ->
            if (i.isEven())
                c.toString().toInt()
            else {
                val v = c.toString().toInt() * 2
                if (v > 9) v - 9 else v
            }
        }.sum().isDivisibleBy(10)
    }
}
