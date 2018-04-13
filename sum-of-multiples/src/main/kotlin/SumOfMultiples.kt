object SumOfMultiples {
    fun sum(s: Set<Int>, n: Int):Int = ((s.min() ?: 0) until n).filter { s.any { f -> it % f == 0 } }.sum()
}
