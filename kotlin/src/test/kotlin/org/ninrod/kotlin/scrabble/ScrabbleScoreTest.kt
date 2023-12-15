package org.ninrod.kotlin.scrabble

import org.amshove.kluent.*
import org.junit.jupiter.api.Test

class ScrabbleScoreTest {
    @Test
    fun `palavras curtas`() {
        ScrabbleScore.scoreWord("a") `should be equal to` 1
        ScrabbleScore.scoreWord("f") `should be equal to` 4
        ScrabbleScore.scoreWord("at") `should be equal to` 2
        ScrabbleScore.scoreWord("zoo") `should be equal to` 12
        ScrabbleScore.scoreWord("") `should be equal to` 0
    }

    @Test
    fun `palavras medias`() {
        ScrabbleScore.scoreWord("street") `should be equal to` 6
        ScrabbleScore.scoreWord("quirky") `should be equal to` 22
        ScrabbleScore.scoreWord("pinata") `should be equal to` 8
    }

    @Test
    fun `palavras grandes`() {
        ScrabbleScore.scoreWord("abcdefghijklmnopqrstuvwxyz") `should be equal to`  87
        ScrabbleScore.scoreWord("OxyphenButazone") `should be equal to` 41
    }
}
