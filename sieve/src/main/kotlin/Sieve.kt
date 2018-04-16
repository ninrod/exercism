object Sieve {
    fun primesUpTo(n: Int): List<Int> {
        return listOf(1)
    }
}
fun main(args: Array<String>) {
    val n = 10
    val l = (2..n).mapNotNull { if (it % 2 == 0) it else null }
    println(l)
}
