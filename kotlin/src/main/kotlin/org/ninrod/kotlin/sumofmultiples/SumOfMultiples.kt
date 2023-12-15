package org.ninrod.kotlin.sumofmultiples

object SumOfMultiples {
    fun sum(s: Set<Int>, n: Int):Int {
        if (s.isEmpty())
            return 0
        return (s.min() until n).filter { s.any { f -> it % f == 0 } }.sum()
    }
}
