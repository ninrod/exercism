package org.ninrod.kotlin.perfectnumbers

enum class Classification { DEFICIENT, PERFECT, ABUNDANT }
fun classify(n: Int): Classification =
        n.let {
            require(it > 0) { "$it should be > 0" }
            (it/2 downTo 1).filter { n % it == 0 }.sum()
        }.compareTo(n).let {
            when {
                it > 0 -> Classification.ABUNDANT
                it < 0 -> Classification.DEFICIENT
                else -> Classification.PERFECT
            }
        }
