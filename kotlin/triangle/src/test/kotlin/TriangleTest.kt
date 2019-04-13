import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TriangleTest {
    @Test
    fun equilateralIfAllSidesAreEqual() {
        Triangle(2, 2, 2).isEquilateral.shouldBeTrue()
    }

    @Test
    fun notEquilateralIfAnySideIsUnequal() {
        Triangle(2, 3, 2).isEquilateral.shouldBeFalse()
    }

    @Test
    fun notEquilateralIfNoSidesAreEqual() {
        Triangle(5, 4, 6).isEquilateral.shouldBeFalse()
    }

    @Test
    fun allZeroSidesAreIllegalSoNotEquilateral() {
        assertThrows<java.lang.IllegalArgumentException> {
            Triangle(0, 0, 0).isEquilateral
        }
    }

    @Test
    fun equilateralSidesMayBeFloatingPoint() {
        Triangle(0.5, 0.5, 0.5).isEquilateral.shouldBeTrue()
    }

    @Test
    fun isoscelesIfLastTwoSidesAreEqual() {
        Triangle(3, 4, 4).isIsosceles.shouldBeTrue()
    }

    @Test
    fun isoscelesIfFirstTwoSidesAreEqual() {
        Triangle(4, 4, 3).isIsosceles.shouldBeTrue()
    }

    @Test
    fun isoscelesIfFirstAndLastSidesAreEqual() {
        Triangle(4, 3, 4).isIsosceles.shouldBeTrue()
    }

    @Test
    fun equilateralIsAlsoIsosceles() {
        Triangle(4, 4, 4).isIsosceles.shouldBeTrue()
    }

    @Test
    fun notIsoscelesIfNoSidesAreEqual() {
        Triangle(2, 3, 4).isIsosceles.shouldBeFalse()
    }

    @Test
    fun sidesViolateTriangleInequalitySoNotIsosceles() {
        assertThrows<java.lang.IllegalArgumentException> {
            Triangle(1, 1, 3).isIsosceles
        }
    }

    @Test
    fun isoscelesSidesMayBeFloatingPoint() {
        Triangle(0.5, 0.4, 0.5).isIsosceles.shouldBeTrue()
    }

    @Test
    fun scaleneIfNoSidesAreEqual() {
        Triangle(5, 4, 6).isScalene.shouldBeTrue()
    }

    @Test
    fun notScaleneIfAllSidesAreEqual() {
        Triangle(4, 4, 4).isScalene.shouldBeFalse()
    }

    @Test
    fun notScaleneIfTwoSidesAreEqual() {
        Triangle(4, 4, 3).isScalene.shouldBeFalse()
    }

    @Test
    fun sidesViolateTriangleInequalitySoNotScalene() {
        assertThrows<java.lang.IllegalArgumentException> {
            Triangle(7, 3, 2).isScalene
        }
    }

    @Test
    fun scaleneSidesMayBeFloatingPoint() {
        Triangle(0.5, 0.4, 0.6).isScalene.shouldBeTrue()
    }
}
