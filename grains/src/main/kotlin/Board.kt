import java.math.BigInteger

object Board {
    fun getGrainCountForSquare(s: Int): BigInteger {
        require(s in (1..64)) {"Only integers between 1 and 64 (inclusive) are allowed"}
        return BigInteger.ONE
    }

    fun getTotalGrainCount(): BigInteger {
       return BigInteger.ONE
    }
}