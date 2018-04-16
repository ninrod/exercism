private fun String.isValidNumber() = this.toBigDecimalOrNull() != null
private fun Char.int() = this.toString().toLong()
class Series(private val s: String) {
    init {
        if(s.isNotEmpty())
            require(s.isValidNumber()) { "string will not parse to a valid number."}
    }
    fun getLargestProduct(n: Int): Long {
        require(s.length >= n) { "n=$n is greater then s.length=${s.length}"}
        require(n >= 0) { "n=$n must be positive" }
        if (n == 0) return 1
        return s.mapIndexed { i, _ ->
            if (i <= s.length - n)
                s.substring((i until i+n)).map{ it.int() }.reduce { a, e -> a * e }
            else
                null
        }.filterNotNull().max() ?: 0
    }
}
