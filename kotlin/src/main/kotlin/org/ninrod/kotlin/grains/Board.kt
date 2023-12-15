package org.ninrod.kotlin.grains

import java.math.BigInteger

object Board {
    fun getGrainCountForSquare(s: Long): BigInteger =
        require(s in (1..64)) {"Only integers between 1 and 64 (inclusive) are allowed"}.let {
            2.toBigInteger().pow(s.toInt() - 1)
        }
    fun getTotalGrainCount() = (1..64).map { getGrainCountForSquare(it.toLong()) }.reduce { a, e -> a + e }
}