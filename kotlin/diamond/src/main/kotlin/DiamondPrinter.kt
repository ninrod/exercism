fun Char.toNumber(): Int = this.toUpperCase().toInt() - 'A'.toInt() + 1
fun Char.spaces(): Int {
    val n = (this.toNumber() - 1) * 2 - 1
    return if (n >= 0) n else 0
}
fun Char.middle(): String {
    val n = this.spaces()
    if (n == 0)
        return this.toString()
    return this + " ".repeat(n) + this
}

fun CharArray.swap(pos1: Int, pos2: Int) {
    val t = this[pos1]
    this[pos1] = this[pos2]
    this[pos2] = t
}

fun String.dec(): String {
    val f = this.indexOfFirst { it.isLetter() }
    val l = this.indexOfLast { it.isLetter() }
    var a = this.toCharArray()

    if (f == l) {
        return ""
    }

    if (this.trim().filter { it.isWhitespace() }.length == 1) {
        a[f] = a[f].dec()
        a.swap(f, f+1)
        a[0] = ' '
        a[a.size - 1] = ' '
        return a.joinToString("")
    }

    a[f] = a[f].dec()
    a.swap(f, f+1)
    a[l] = a[l].dec()
    a.swap(l, l-1)
    return a.joinToString("")
}

object DiamondPrinter {
    fun printToList(c: Char):List<String> {
        val c = c.toUpperCase()
        val m = c.middle()
        val a = arrayListOf(c.middle())

        var d = m.dec()
        while(d.isNotEmpty()) {
            a.add(0, d)
            d = d.dec()
        }

        /*
        if (a.size == 1)
            return a

        for (i in (a.size - 2)..0)
           a.add(a[i])
         */

        return a
    }
    fun prettyPrint(a: List<String>) {
        for (i in a)
            println(i)
    }
}

fun main() {
    val s = DiamondPrinter.printToList('e')
    DiamondPrinter.prettyPrint(s)

    println('B'.middle().dec())
}
