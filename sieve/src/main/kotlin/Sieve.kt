object Sieve {
    fun primesUpTo(n: Int): List<Int> {
        return listOf(1)
    }
}

fun test(): Pair<List<Int>, Int> = Pair(listOf(1), 1)

fun main(args: Array<String>) {
    val (a, b) = test()
    println(a)
    println(b)
}
