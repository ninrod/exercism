fun Int.isPrime(): Boolean {
    (this/2 downTo 2).forEach { if (this % it == 0) return false }
    return true
}
object Prime {
    fun nth(n: Int): Int {
        require(n > 0) { "There is no zeroth prime." }
        var acc = 0
        generateSequence(2, Int::inc).forEach {
            if (it.isPrime()) if (++acc == n) return it
        }
        return 0
    }
}
