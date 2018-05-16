object Atbash {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val numbers = "123456789"
    val e = alphabet + numbers
    val er = alphabet.reversed() + numbers
    var map: Map<Char, Char> = e.mapIndexed { i, c ->  c to er[i] }.toMap()
    val reversed = map.entries.associateBy({ it.value }) { it.key }
    val regex = """[${' '},.,${'!'},${'?'},${','}]""".toRegex()

    fun encode(input: String): String = input
            .replace(regex, "")
            .toLowerCase()
            .map { map[it] }.joinToString("")
            .chunked(5)
            .joinToString(" ")

    fun decode(input: String): String = input
            .replace(regex, "")
            .toLowerCase()
            .map { reversed[it] }.joinToString("")
}
