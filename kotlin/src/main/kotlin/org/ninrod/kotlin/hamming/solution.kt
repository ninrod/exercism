package org.ninrod.kotlin.hamming

object Hamming {
    fun compute(a: String, b: String): Int {
        require(a.length == b.length) {"left and right strands must be of equal length."}
        return a.mapIndexed { index, it -> if (it == b[index]) 0 else 1 }
                .fold(0){s,e -> s + e}
    }
}