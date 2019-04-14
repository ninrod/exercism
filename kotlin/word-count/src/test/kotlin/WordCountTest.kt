import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test

class WordCountTest {
    @Test
    fun countOneWord() {
        WordCount.phrase("word") `should equal` mapOf("word" to 1)
    }

    @Test
    fun countOneOfEach() {
        WordCount.phrase("one of each") `should equal` mapOf("one" to 1, "of" to 1, "each" to 1)
    }

    @Test
    fun countMultipleOccurrences() {
        WordCount.phrase("one fish two fish red fish blue fish") `should equal`
                mapOf("one" to 1, "fish" to 4, "two" to 1, "red" to 1, "blue" to 1)
    }

    @Test
    fun countCrampedList() {
        WordCount.phrase("one,two,three") `should equal` mapOf("one" to 1, "two" to 1, "three" to 1)
    }

    @Test
    fun countExpandedList() {
        WordCount.phrase("one,\ntwo,\nthree") `should equal` mapOf("one" to 1, "two" to 1, "three" to 1)
    }

    @Test
    fun ignorePunctuation() {
        WordCount.phrase("car: carpet as java: javascript!!&@\$%^&") `should equal`
        mapOf("car" to 1, "carpet" to 1, "as" to 1, "java" to 1, "javascript" to 1)
    }

    @Test
    fun countsNumbers() {
        WordCount.phrase("testing, 1, 2 testing") `should equal` mapOf("testing" to 2, "1" to 1, "2" to 1)
    }

    @Test
    fun countsCaseInsensitively() {
        WordCount.phrase("go Go GO Stop stop") `should equal` mapOf("go" to 3, "stop" to 2)
    }

    @Test
    fun allowsApostrophes() {
        WordCount.phrase("First: don't laugh. Then: don't cry.") `should equal`
                mapOf("first" to 1, "don't" to 2, "laugh" to 1, "then" to 1, "cry" to 1)
    }

    @Test
    fun allowsQuotations() {
        WordCount.phrase("Joe can't tell between 'large' and large.") `should equal`
                mapOf("joe" to 1, "can't" to 1, "tell" to 1, "between" to 1, "large" to 2, "and" to 1)
    }
}
