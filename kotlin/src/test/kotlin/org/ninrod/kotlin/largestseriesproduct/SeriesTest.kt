package org.ninrod.kotlin.largestseriesproduct

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SeriesTest {
    @Test
    fun findsTheLargestProductIfSpanEqualsLength() {
        18L `should be equal to`  Series("29").getLargestProduct(2)
    }


    @Test
    fun findsTheLargestProductOf2WithNumbersInOrder() {
        72L `should be equal to`  Series("0123456789").getLargestProduct(2)
    }


    @Test
    fun findsTheLargestProductOf2() {
        48L `should be equal to`  Series("576802143").getLargestProduct(2)
    }


    @Test
    fun findsTheLargestProductOf3WithNumbersInOrder() {
        504L `should be equal to`  Series("0123456789").getLargestProduct(3)
    }


    @Test
    fun findsTheLargestProductOf3() {
        270L `should be equal to`  Series("1027839564").getLargestProduct(3)
    }


    @Test
    fun findsTheLargestProductOf5WithNumbersInOrder() {
        15120L `should be equal to`  Series("0123456789").getLargestProduct(5)
    }


    @Test
    fun findsTheLargestProductWithinABigNumber() {
        23520L `should be equal to`  Series("73167176531330624919225119674426574742355349194934").getLargestProduct(6)
    }


    @Test
    fun reports0IfAllDigitsAre0() {
        0L `should be equal to`  Series("0000").getLargestProduct(2)
    }


    @Test
    fun reports0IfAllSpansInclude0() {
        0L `should be equal to`  Series("99099").getLargestProduct(3)
    }

    @Test
    fun reports1ForEmptyStringAndEmptyProduct() {
        1L `should be equal to`  Series("").getLargestProduct(0)
    }


    @Test
    fun reports1ForNonEmptyStringAndEmptyProduct() {
        1L `should be equal to`  Series("123").getLargestProduct(0)
    }

    @Test
    fun rejectsEmptyStringAndNonZeroSpan() {
        assertThrows<java.lang.IllegalArgumentException>("should throw illegal argument") {
            Series("").getLargestProduct(1)
        }
    }

    @Test
    fun rejectsInvalidCharacterInDigits() {
        assertThrows<java.lang.IllegalArgumentException> ("should throw illegal argument") {
            Series("1234a5")
        }
    }

    @Test
    fun rejectsNegativeSpan() {
        assertThrows<java.lang.IllegalArgumentException> ("should throw illegal argument") {
            Series("12345").getLargestProduct(-1)
        }
    }

    @Test
    fun rejectsSpanLongerThanStringLength() {
        assertThrows<java.lang.IllegalArgumentException>("should throw illegal argument") {
            Series("123").getLargestProduct(4)
        }
    }
}
