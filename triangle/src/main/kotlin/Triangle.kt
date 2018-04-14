class Triangle(a: Number, b: Number, c: Number) {
    private val l = listOf(a.toDouble(), b.toDouble(), c.toDouble()).sorted()
    init {
        require(l.sum() > 0) { "sum of sides must be > 0" }
        require(l[0] + l[1] > l[2])
    }
    val isEquilateral: Boolean get() = l[0] == l[1] && l[1] == l[2]
    val isIsosceles: Boolean get() = l[0] == l[1] || l[0] == l[2] || l[1] == l[2]
    val isScalene: Boolean get() = l[0] != l[1] && l[0] != l[2] && l[1] != l[2]
}
