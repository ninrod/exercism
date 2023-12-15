package org.ninrod.kotlin.triangle

class Triangle(vararg list: Number) {
    private val l = list.map { it.toDouble() }.sorted()
    var isEquilateral: Boolean = false
    var isIsosceles: Boolean = false
    var isScalene: Boolean = false
    init {
        require(l[0] + l[1] > l[2]) { "triangle is invalid"}
        when(l.distinct().size) {
            1 -> {isEquilateral = true; isIsosceles = true;}
            2 -> isIsosceles = true
            else -> isScalene = true
        }
    }
}
