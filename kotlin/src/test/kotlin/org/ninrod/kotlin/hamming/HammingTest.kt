package org.ninrod.kotlin.hamming

import org.junit.jupiter.api.Test
import org.amshove.kluent.`should be equal to`

import org.junit.jupiter.api.assertThrows

class HammingTest {

    @Test
    fun noDistanceBetweenEmptyStrands() {
        0 `should be equal to`  Hamming.compute("", "")
    }

    @Test
    fun noDistanceBetweenShortIdenticalStrands() {
        0 `should be equal to`  Hamming.compute("A", "A")
    }


    @Test
    fun noDistanceBetweenLongIdenticalStrands() {
        0 `should be equal to`  Hamming.compute("GGACTGA", "GGACTGA")
    }


    @Test
    fun completeDistanceInSingleNucleotideStrand() {
        1 `should be equal to`  Hamming.compute("A", "G")
    }


    @Test
    fun completeDistanceInSmallStrand() {
        2 `should be equal to`  Hamming.compute("AG", "CT")
    }


    @Test
    fun smallDistanceInSmallStrand() {
        1 `should be equal to`  Hamming.compute("AT", "CT")
    }


    @Test
    fun smallDistanceInMediumStrand() {
        1 `should be equal to`  Hamming.compute("GGACG", "GGTCG")
    }


    @Test
    fun smallDistanceInLongStrand() {
        2 `should be equal to`  Hamming.compute("ACCAGGG", "ACTATGG")
    }


    @Test
    fun nonUniqueCharacterInFirstStrand() {
        1 `should be equal to`  Hamming.compute("AAG", "AAA")
    }


    @Test
    fun nonUniqueCharacterInSecondStrand() {
        1 `should be equal to`  Hamming.compute("AAA", "AAG")
    }


    @Test
    fun sameNucleotidesInDifferentPositions() {
        2 `should be equal to`  Hamming.compute("TAG", "GAT")
    }


    @Test
    fun largeDistanceInPermutedStrand() {
        4 `should be equal to`  Hamming.compute("GATACA", "GCATAA")
    }


    @Test
    fun largeDistanceInOffByOneStrand() {
        9 `should be equal to`  Hamming.compute("GGACGGATTCTG", "AGGACGGATTCT")
    }


    @Test
    fun validatesFirstStrandNotLonger() {
        assertThrows<java.lang.IllegalArgumentException>("should throw IllegalArgumentEx") {
            Hamming.compute("AATG", "AAA")
        }.message?.`should be equal to`("left and right strands must be of equal length.")
    }


    @Test
    fun validatesSecondStrandNotLonger() {
        assertThrows<java.lang.IllegalArgumentException>("should throw IllegalArgumentEx") {
            Hamming.compute("ATA", "AGTG")
        }.message?.`should be equal to`("left and right strands must be of equal length.")
    }
}
