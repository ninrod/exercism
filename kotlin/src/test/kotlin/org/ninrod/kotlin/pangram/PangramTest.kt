package org.ninrod.kotlin.pangram

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.jupiter.api.Test

class PangramTest {

    @Test
    fun emptySentence() {
        Pangram.isPangram("").shouldBeFalse()
    }

    @Test
    fun perfectLowercasePangram() {
        Pangram.isPangram("abcdefghijklmnopqrstuvwxyz").shouldBeTrue()
    }

    @Test
    fun lowercasePangram() {
        Pangram.isPangram("the quick brown fox jumps over the lazy dog").shouldBeTrue()
    }

    @Test
    fun missingCharacterX() {
        Pangram.isPangram("a quick movement of the enemy will jeopardize five gunboats").shouldBeFalse()
    }

    @Test
    fun anotherMissingCharacterX() {
        Pangram.isPangram("five boxing wizards jump quickly at it").shouldBeFalse()
    }

    @Test
    fun withUnderscores() {
        Pangram.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog").shouldBeTrue()
    }

    @Test
    fun withNumbers() {
        Pangram.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs").shouldBeTrue()
    }

    @Test
    fun missingLettersReplacedByNumbers() {
        Pangram.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog").shouldBeFalse()
    }

    @Test
    fun mixedCaseAndPunctuation() {
        Pangram.isPangram("\"Five quacking Zephyrs jolt my wax bed.\"").shouldBeTrue()
    }

    @Test
    fun mixedCaseDuplicatedCharacters() {
        Pangram.isPangram("the quick brown fox jumps over with lazy FX").shouldBeFalse()
    }
}
