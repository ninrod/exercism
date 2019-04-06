object Acronym {
   fun generate(f: String) = f.split(' ', '-').map{ it[0].toUpperCase() }.joinToString("")
}

fun main() {
    val map = mapOf(
            1 to "Filipe",
            2 to "Evelize",
            3 to "Juliana",
            4 to "Adelva",
            5 to "Caim"
    )
    println(map)
}
