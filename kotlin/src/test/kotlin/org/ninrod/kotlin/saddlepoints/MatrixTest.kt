package org.ninrod.kotlin.saddlepoints

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class MatrixTest {
    @Test
    fun testCanIdentifySingleSaddlePoint() {
        Matrix(listOf(
            listOf(9, 8, 7),
            listOf(5, 3, 2),
            listOf(6, 6, 7)
        )).saddlePoints `should be equal to` setOf(MatrixCoordinate(1, 0))
    }

    @Test
    fun testCanIdentifyThatEmptyMatrixHasNoSaddlePoints() {
        Matrix(listOf(emptyList())).saddlePoints `should be equal to` emptySet()
    }

    @Test
    fun testCanIdentifyLackOfSaddlePointsWhenThereAreNone() {
        Matrix(listOf(
            listOf(1, 2, 3),
            listOf(3, 1, 2),
            listOf(2, 3, 1)
        )).saddlePoints `should be equal to` emptySet()
    }

    @Test
    fun testCanIdentifyMultipleSaddlePoints() {
        Matrix(listOf(
            listOf(4, 5, 4),
            listOf(3, 5, 5),
            listOf(1, 5, 4)
        )).saddlePoints `should be equal to` setOf(
            MatrixCoordinate(0, 1),
            MatrixCoordinate(1, 1),
            MatrixCoordinate(2, 1)
        )
    }

    @Test
    fun testCanIdentifySaddlePointInBottomRightCorner() {
        Matrix(listOf(
            listOf(8, 7, 9),
            listOf(6, 7, 6),
            listOf(3, 2, 5)
        )).saddlePoints `should be equal to` setOf(MatrixCoordinate(2, 2))
    }
}
