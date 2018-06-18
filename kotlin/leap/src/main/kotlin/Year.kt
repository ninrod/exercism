// on every year that is evenly divisible by 4
//   except every year that is evenly divisible by 100
//     unless the year is also evenly divisible by 400
fun Int.divisible(d: Int): Boolean = this % d == 0
data class Year (val year: Int) {
    val isLeap: Boolean get() {
        val d4 = year.divisible(4)
        // if not divisible by 4, it is not leap
        if (!d4) return false

        // ok, should be leap, except if it is divisible by 100
        val d100 = year.divisible(100)
        // not divisible by 100, so it is leap
        if (!d100) return true

        // ok it is divisible by 100,
        val d400 = year.divisible(400)
        // so if it is also divisible by 400 it is leap
        if (d400) return true

        // not divisible by 400, so it is not leap
        return false
    }
}

fun main(args: Array<String>) {
    val year = 1996
    val r = Year(year).isLeap

    val d4 = year.divisible(4)
    val d100 = year.divisible(100)
    val d400 = year.divisible(400)

    println("leap of $year is $r")
    println("d4 = $d4")
    println("d100 = $d100")
    println("d400 = $d400")
}