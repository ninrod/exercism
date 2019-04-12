import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.jupiter.api.Test

class LuhnTest {
    @Test
    fun singleDigitStringsCannotBeValid() {
        Luhn.isValid("1").shouldBeFalse()
    }

    @Test
    fun singleZeroIsInvalid() {
        Luhn.isValid("0").shouldBeFalse()
    }

    @Test
    fun simpleValidSINThatRemainsValidIfReversed() {
        Luhn.isValid("059").shouldBeTrue()
    }

    @Test
    fun simpleValidSINThatBecomesInvalidIfReversed() {
        Luhn.isValid("59").shouldBeTrue()
    }

    @Test
    fun validCanadianSIN() {
        Luhn.isValid("055 444 285").shouldBeTrue()
    }

    @Test
    fun invalidCanadianSIN() {
        Luhn.isValid("055 444 286").shouldBeFalse()
    }

    @Test
    fun invalidCreditCard() {
        Luhn.isValid("8273 1232 7352 0569").shouldBeFalse()
    }

    @Test
    fun validStringsWithNonDigitIncludedBecomeInvalid() {
        Luhn.isValid("055a 444 285").shouldBeFalse()
    }

    @Test
    fun validStringsWithPunctuationIncludedBecomeInvalid() {
        Luhn.isValid("055-444-285").shouldBeFalse()
    }

    @Test
    fun validStringsWithSymbolsIncludedBecomeInvalid() {
        Luhn.isValid("055£ 444$ 285").shouldBeFalse()
    }

    @Test
    fun singleZeroWithSpaceIsInvalid() {
        Luhn.isValid(" 0").shouldBeFalse()
    }

    @Test
    fun moreThanSingleZeroIsValid() {
        Luhn.isValid("0000 0").shouldBeTrue()
    }

    @Test
    fun inputDigit9IsCorrectlyConvertedToOutputDigit9() {
        Luhn.isValid("091").shouldBeTrue()
    }
}
