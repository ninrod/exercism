object Sieve {
    fun primesUpTo(n: Int): List<Int> {
        return listOf(1)
    }
}

fun reduce(l: List<Int>, pos: Int): Pair<List<Int>, Int> = Pair(listOf(1), 1)

fun main(args: Array<String>) {
    val (a, b) = reduce((2..10).toList(), 1)
    println(a)
    println(b)
}
