package org.ninrod.kotlin.acronym

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class AcronymTest {

    @Test
    fun fromTitleCasedPhrases() {
        val phrase = "Portable Network Graphics"
        val expected = "PNG"
        Acronym.generate(phrase) `should be equal to`  expected
    }

    @Test
    fun fromOtherTitleCasedPhrases() {
        val phrase = "Ruby on Rails"
        val expected = "ROR"
        Acronym.generate(phrase) `should be equal to` expected
    }

    @Test
    fun fromPhrasesWithPunctuation() {
        val phrase = "First In, First Out"
        val expected = "FIFO"
        Acronym.generate(phrase) `should be equal to`  expected
    }

    @Test
    fun fromAllCapsWord() {
        val phrase = "PHP: Hypertext Preprocessor"
        val expected = "PHP"
        Acronym.generate(phrase) `should be equal to`  expected
    }

    @Test
    fun fromNonAcronymAllCapsWord() {
        val phrase = "GNU Image Manipulation Program"
        val expected = "GIMP"
        Acronym.generate(phrase) `should be equal to` expected
    }

    @Test
    fun fromPhrasesWithPunctuationAndSentenceCasing() {
        val phrase = "Complementary metal-oxide semiconductor"
        val expected = "CMOS"
        Acronym.generate(phrase) `should be equal to`  expected
    }

}

