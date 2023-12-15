package org.ninrod.kotlin.primes

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PrimeTests {
    @Test
    fun firstPrime() {
        2 `should be equal to` Prime.nth(1)
    }

    @Test
    fun secondPrime() {
        3 `should be equal to` Prime.nth(2)
    }

    @Test
    fun sixthPrime() {
        13 `should be equal to` Prime.nth(6)
    }

    @Test
    fun bigPrime() {
        104743 `should be equal to` Prime.nth(10001)
    }

    @Test
    fun undefinedPrime() {
        assertThrows<java.lang.IllegalArgumentException> {
            Prime.nth(0)
        }.message?.`should be equal to`("There is no zeroth prime.")
    }
}
