package org.ninrod.kotlin.collatz

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CollatzCalculatorTest {
    @Test
    fun testZeroStepsRequiredWhenStartingFrom1() {
        CollatzCalculator.computeStepCount(1) `should be equal to` 0
    }


    @Test
    fun testCorrectNumberOfStepsWhenAllStepsAreDivisions() {
        CollatzCalculator.computeStepCount(16) `should be equal to`  4
    }


    @Test
    fun testCorrectNumberOfStepsWhenBothStepTypesAreNeeded() {
         CollatzCalculator.computeStepCount(12) `should be equal to` 9
    }


    @Test
    fun testAVeryLargeInput() {
        CollatzCalculator.computeStepCount(1000000) `should be equal to`  152
    }


    @Test
    fun testZeroIsConsideredInvalidInput() {
        assertThrows<IllegalArgumentException>("should throw illegalArgument") {
            CollatzCalculator.computeStepCount(0)
        }.message?.`should be equal to`("Only natural numbers are allowed")
    }


    @Test
    fun testNegativeIntegerIsConsideredInvalidInput() {
        assertThrows<IllegalArgumentException>("should throw illegalArgument") {
            CollatzCalculator.computeStepCount(-15)
        }.message?.`should be equal to`("Only natural numbers are allowed")
    }
}
