object Pangram {
    fun isPangram(s: String): Boolean = s
            .toLowerCase()
            .toList()
            .containsAll("abcdefghijklmnopqrstuvwxyz".toSet())
}
