class Triangle(aa: Number, bb: Number, cc: Number) {
    private val a = aa.toDouble()
    private val b = bb.toDouble()
    private val c = cc.toDouble()
    private val l = listOf(a,b,c).sorted()
    init {
        require(l.sum() > 0) { "sum of sides must be > 0" }
        require(l[0] + l[1] > l[2])
    }
    val isEquilateral: Boolean get() = a == b && a == c
    val isIsosceles: Boolean get() = a == b || a == c || b == c
    val isScalene: Boolean get() = a != b && a != c && b != c
}
