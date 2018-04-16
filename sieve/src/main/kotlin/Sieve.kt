object Sieve {
    private fun reduce(list: List<Int>, pos: Int): Pair<List<Int>, Int> {
        if (pos >= list.size - 1)
            return Pair(list, pos)
        val n = list.take(pos + 1) + list.drop(pos + 1).filterNot { it % list[pos] == 0 }
        return reduce(n, n.indexOf(list[pos]) + 1)
    }
    fun primesUpTo(n: Int): List<Int> {
        return reduce((2..n).toList(), 0).first
    }
}
