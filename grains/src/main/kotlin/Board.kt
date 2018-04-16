import java.math.BigInteger

object Board {
    fun getGrainCountForSquare(s: Long): BigInteger {
        require(s in (1..64)) {"Only integers between 1 and 64 (inclusive) are allowed"}
        return BigInteger.valueOf(2).pow(s.toInt() - 1)
    }
    fun getTotalGrainCount(): BigInteger = (1..64).fold(BigInteger.ZERO) {
        a, e -> a.add(getGrainCountForSquare(e.toLong()))
    }
}