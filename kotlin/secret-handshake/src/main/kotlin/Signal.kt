enum class Signal(private val bit: Int, private val pos: Int) {
  WINK(0b1, 0),
  DOUBLE_BLINK(0b10, 1),
  CLOSE_YOUR_EYES(0b100, 2),
  JUMP(0b1000, 3),
  REVERSE(0b10000, 4);
  companion object {
    fun handshake(n: Int): List<Signal> {
      val l = listOf(WINK,DOUBLE_BLINK,CLOSE_YOUR_EYES,JUMP).filter { it.hasBit(n) }
      return if (REVERSE.hasBit(n)) l.asReversed() else l
    }
  }
  private fun hasBit(n: Int) = n and bit ushr pos == 1
}
