import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class RnaTranscriptionTest {
    @Test
    fun cytosineComplementIsGuanine() {
        "G" `should be equal to`  transcribeToRna("C")
    }

    @Test
    fun guanineComplementIsCytosine() {
        "C" `should be equal to`  transcribeToRna("G")
    }

    @Test
    fun thymineComplementIsAdenine() {
        "A" `should be equal to`  transcribeToRna("T")
    }

    @Test
    fun adenineComplementIsUracil() {
        "U" `should be equal to`  transcribeToRna("A")
    }

    @Test
    fun rnaTranscription() {
        "UGCACCAGAAUU" `should be equal to`  transcribeToRna("ACGTGGTCTTAA")
    }
}
