object SumOfMultiples {
    fun sum(s: Set<Int>, n: Int):Int = ((s.min() ?: 0) until n).filter { s.any { f -> it % f == 0 } }.sum()
}

fun main(args: Array<String>) {
    val s = SumOfMultiples.sum(setOf(30,50,70,110),200)
    println(s)
}
