object Atbash {
    private val alphabet = ('a'..'z').toList().joinToString("")
    private val numbers = (0..9).toList().joinToString("")
    private val e = alphabet + numbers
    private val er = alphabet.reversed() + numbers
    private var map: Map<Char, Char> = e.mapIndexed { i, c ->  c to er[i] }.toMap()
    private val reversedMap = map.entries.associateBy({ it.value }) { it.key }
    private val regex = """[${' '},.,${'!'},${'?'},${','}]""".toRegex()
    private fun cifra(input: String, map: Map<Char,Char>): String = input
            .replace(regex, "")
            .toLowerCase()
            .map { map[it] }.joinToString("")
    fun encode(input: String): String = cifra(input, map).chunked(5).joinToString(" ")
    fun decode(input: String): String = cifra(input, reversedMap)
}
