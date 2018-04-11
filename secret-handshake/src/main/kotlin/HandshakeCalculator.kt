object HandshakeCalculator {
    fun calculateHandshake(n: Int): List<Signal> {
        return listOf(Signal.CLOSE_YOUR_EYES)
    }
}

fun main(args: Array<String>) {
    val n = 3
    val r = n and 0b11111
    val x = r and 0b10000
    println(r.toString(2))
    println(x.toString(2))
}

/*
00001 - wink
00010 - double blink
00100 - close your eyes
01000 - jump
10000 - reverse
*/
