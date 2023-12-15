package org.ninrod.kotlin.scrabble

object ScrabbleScore {
    private fun addToMap(s: String, v: Int, m: MutableMap<Char, Int>) = s.forEach { m[it] = v }
    private fun constructMap(): Map<Char, Int> {
        val map = mutableMapOf('A' to 1)
        addToMap("EIOULNRST", 1, map)
        addToMap("DG", 2, map)
        addToMap("BCMP", 3, map)
        addToMap("FHVWY", 4, map)
        addToMap("K", 5, map)
        addToMap("JX", 8, map)
        addToMap("QZ", 10, map)
        return map
    }
    private val map = constructMap()
    fun scoreWord(w: String): Int = w.map { map[it.uppercaseChar()] }.fold(0) { a, b -> a + (b ?: 0) }
}
