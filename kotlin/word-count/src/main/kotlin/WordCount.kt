fun String.sanitize(): String {
    return this.replace("[,:.\n!&@\$%^]".toRegex(), " ")
            .replace("\\s+".toRegex(), " ")
            .trim()
            .toLowerCase()
}

fun String.unquote(): String =
        if (this.first() == '\'' && this.last() == '\'') this.substring(1 until this.length - 1) else this

object WordCount {
    fun phrase(str: String): Map<String, Int> {
        val s = str.sanitize()
        val m = HashMap<String, Int>()
        s.split(" ").map { it.unquote() }.forEach {
            if (m.containsKey(it))
                m[it] = (m[it]?: 0) + 1
            else
                m[it] = 1
        }
        return m
    }
}
