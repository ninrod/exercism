object Sieve {
    private fun sieve(l: List<Int>): List<Int> = if (l.isEmpty()) l else l.take(1) + sieve(l.drop(1) - (l.first()..l.last()).step(l.first()).drop(1).toList())
    fun primesUpTo(n: Int): List<Int> = sieve((2..n).toList())
}
