package org.ninrod.kotlin.sumofmultiples

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class SumOfMultiplesTest {
    @Test
    fun `multiples of 3 or 5 up to 1`() {
        SumOfMultiples.sum(setOf(3, 5), 1) `should be equal to` 0
    }

    @Test
    fun `multiples of 3 or 5 up to 4`() {
        SumOfMultiples.sum(setOf(3, 5), 4) `should be equal to` 3
    }

    @Test
    fun `multiples of 3 up to 7`() {
        SumOfMultiples.sum(setOf(3), 7) `should be equal to` 9
    }

    @Test
    fun `multiples of 3 or 5 up to 10`() {
        SumOfMultiples.sum(setOf(3, 5), 10) `should be equal to` 23
    }

    @Test
    fun `multiples of 3 or 5 up to 100`() {
        SumOfMultiples.sum(setOf(3, 5), 100) `should be equal to` 2318
    }

    @Test
    fun `multiples of 3 or 5 up to 1000`() {
        SumOfMultiples.sum(setOf(3, 5), 1000) `should be equal to` 233168
    }

    @Test
    fun `multiples of 7, 13 or 17 up to 20`() {
        SumOfMultiples.sum(setOf(7, 13, 17), 20) `should be equal to` 51
    }

    @Test
    fun `multiples of 4 or 6 up to 15`() {
        SumOfMultiples.sum(setOf(4, 6), 15) `should be equal to` 30
    }

    @Test
    fun `multiples of 5, 6 or 8 up to 150`() {
        SumOfMultiples.sum(setOf(5, 6, 8), 150) `should be equal to` 4419
    }

    @Test
    fun `multiples of 5 or 25 up to 51`() {
          SumOfMultiples.sum(setOf(5, 25), 51) `should be equal to` 275
    }

    @Test
    fun `multiples of 43 or 47 up to 10000`() {
        SumOfMultiples.sum(setOf(43, 47), 10000) `should be equal to` 2203160
    }

    @Test
    fun `multiples of 1 up to 100`() {
        SumOfMultiples.sum(setOf(1), 100) `should be equal to` 4950
    }

    @Test
    fun `multiples of an empty set up to 10000`() {
        SumOfMultiples.sum(emptySet(), 10000) `should be equal to` 0
    }
}
