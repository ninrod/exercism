package org.ninrod.kotlin.secrethandshake

import org.junit.jupiter.api.Test
import org.amshove.kluent.*

class HandshakeCalculatorTest {

    @Test
    fun testThatInput1YieldsAWink() {
        HandshakeCalculator.calculateHandshake(1) `should be equal to` listOf(Signal.WINK)
    }

    @Test
    fun testThatInput2YieldsADoubleBlink() {
        listOf(Signal.DOUBLE_BLINK) `should be equal to`  HandshakeCalculator.calculateHandshake(2)

    }

    @Test
    fun testThatInput4YieldsACloseYourEyes() {
         listOf(Signal.CLOSE_YOUR_EYES) `should be equal to`  HandshakeCalculator.calculateHandshake(4)
    }

    @Test
    fun testThatInput8YieldsAJump() {
         listOf(Signal.JUMP) `should be equal to`  HandshakeCalculator.calculateHandshake(8)
    }

    @Test
    fun testAnInputThatYieldsTwoActions() {
        listOf(Signal.WINK, Signal.DOUBLE_BLINK) `should be equal to`  HandshakeCalculator.calculateHandshake(3)
    }

    @Test
    fun testAnInputThatYieldsTwoReversedActions() {
        listOf(Signal.DOUBLE_BLINK, Signal.WINK) `should be equal to`  HandshakeCalculator.calculateHandshake(19)
    }

    @Test
    fun testReversingASingleActionYieldsTheSameAction() {
        listOf(Signal.JUMP) `should be equal to`  HandshakeCalculator.calculateHandshake(24)
    }

    @Test
    fun testReversingNoActionsYieldsNoActions() {
        HandshakeCalculator.calculateHandshake(16).`should be empty`()
    }

    @Test
    fun testInputThatYieldsAllActions() {
        listOf(Signal.WINK, Signal.DOUBLE_BLINK, Signal.CLOSE_YOUR_EYES, Signal.JUMP) `should be equal to`
                HandshakeCalculator.calculateHandshake(15)
    }

    @Test
    fun testInputThatYieldsAllActionsReversed() {
        listOf(Signal.JUMP, Signal.CLOSE_YOUR_EYES, Signal.DOUBLE_BLINK, Signal.WINK) `should be equal to`
                HandshakeCalculator.calculateHandshake(31)
    }

    @Test
    fun testThatInput0YieldsNoActions() {
        HandshakeCalculator.calculateHandshake(0).`should be empty`()
    }

    @Test
    fun testThatInputWithLower5BitsNotSetYieldsNoActions() {
        HandshakeCalculator.calculateHandshake(32).`should be empty`()
    }
}
