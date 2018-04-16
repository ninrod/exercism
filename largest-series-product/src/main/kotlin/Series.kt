private fun String.isValidNumber() = this.toBigDecimalOrNull() != null
class Series(private val s: String) {
    init {
        if(s.isNotEmpty())
            require(s.isValidNumber()) { "string will not parse to a valid number."}
    }
    fun getLargestProduct(n: Int): Int {
        require(s.length >= n) { "n=$n is greater then s.length=${s.length}"}
        if (n == 0) return 1
        return 0
    }
}

fun main(args: Array<String>) {

}