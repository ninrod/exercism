object Prime {
    fun isPrime(n: Int): Boolean {
        val a = n/2
        (a downTo 2).forEach {
            if (a % it == 0) {
                return true
            }
        }
        return false
    }

    fun nth(n: Int): Int {
        var acc = 0
        generateSequence(2, Int::inc).forEach {

       }
       return n
   }
}

fun main(args: Array<String>) {
    val prime = 14
    println(Prime.isPrime(prime))
}