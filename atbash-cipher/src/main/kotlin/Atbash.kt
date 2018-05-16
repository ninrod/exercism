object Atbash {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val numbers = "123456789"
    val e = alphabet + numbers
    val er = alphabet.reversed() + numbers
    var map = e.mapIndexed { i, c ->  c to er[i] }.toMap()

    fun encode(input: String): String =
            input.replace("""[\s,.,${'!'},${'?'},,]""".toRegex(), "")
                .toLowerCase()
                .map { map[it] }.joinToString("")
                .chunked(5)
                .joinToString(" ")

    fun decode(input: String): String = ""
}

fun main(args: Array<String>) {
    val a = "thequickbrownfoxjumpsoverthelazydog"
    println(Atbash.encode(a))
}