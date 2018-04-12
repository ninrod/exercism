object SumOfMultiples {
    fun sum(s: Set<Int>, n: Int): Int = (n-1 downTo (s.min().takeIf { i -> i != null } ?: 0))
            .filter { s.filter { f -> it % f == 0 }.isNotEmpty() } .sum()
}
