package org.ninrod.kotlin.raindrops

object Raindrops {
    fun convert(i: Int): String {
        val b = listOf(
                if (i % 3 == 0) "Pling" else "",
                if (i % 5 == 0) "Plang" else "",
                if (i % 7 == 0) "Plong" else ""
        ).joinToString("")
        return if (b.isNotEmpty()) b else i.toString()
    }
}

/*
- 28's factors are 1, 2, 4, **7**, 14, 28.
- In raindrop-speak, this would be a simple "Plong".
- 30's factors are 1, 2, **3**, **5**, 6, 10, 15, 30.
- In raindrop-speak, this would be a "PlingPlang".
- 34 has four factors: 1, 2, 17, and 34.
- In raindrop-speak, this would be "34".
*/
fun main() {
    println(Raindrops.convert(28))
    println(Raindrops.convert(30))
    println(Raindrops.convert(34))
}
