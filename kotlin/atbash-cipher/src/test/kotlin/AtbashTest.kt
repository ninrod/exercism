import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class AtbashTest {
    private fun String.encode() = Atbash.encode(this)
    private fun String.decode() = Atbash.decode(this)

    @Test
    fun encodedTest() {
        "yes".encode() `should be equal to` "bvh"
        "no".encode() `should be equal to`  "ml"
        "OMG".encode() `should be equal to` "lnt"
        "O M G".encode() `should be equal to` "lnt"
        "mindblowingly".encode() `should be equal to` "nrmwy oldrm tob"
        "Testing,1 2 3, testing.".encode() `should be equal to` "gvhgr mt123 gvhgr mt"
        "Truth is fiction.".encode() `should be equal to` "gifgs rhurx grlm"
        "The quick brown fox jumps over the lazy dog.".encode() `should be equal to` "gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt"
    }

    @Test
    fun decodeTest() {
        "vcvix rhn".decode() `should be equal to` "exercism"
        "zmlyh gzxov rhlug vmzhg vkkrm thglm v".decode() `should be equal to` "anobstacleisoftenasteppingstone"
        "gvhgr mt123 gvhgr mt".decode() `should be equal to` "testing123testing"
    }

}
