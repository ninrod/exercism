fun Int.isEven() = this % 2 == 0
fun Int.collatz() = this * 3 + 1
object CollatzCalculator {
    fun computeStepCount(i: Int): Int {
        require(i > 0) {"Only natural numbers are allowed"}
        var t = i
        var s = 0
        while (t > 1) {
            t = if (t.isEven()) t / 2 else t.collatz()
            s++
        }
        return s
    }
}