// on every year that is evenly divisible by 4
//   except every year that is evenly divisible by 100
//     unless the year is also evenly divisible by 400

Int.divisible(d: Int): Boolean = this % d == 0

data class Year (val year: Int) {
    val isLeap: Boolean get() {
        val d4 = year.divisible(4)
        if (! d4) return false

        val d100 = year.divisible(100)
        val d400 = year.divisible(400)

        return d100 && !d400
    }
}