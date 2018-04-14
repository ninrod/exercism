class Triangle() {
    constructor(a: Number, b: Number, c : Number): this() {
        require(a.toDouble() > 0 && b.toDouble() > 0 && c.toDouble() > 0) {
            "all sides can't be 0 at the same time"
        }
    }
    val isEquilateral: Boolean get() {
        return false
    }
    val isIsosceles: Boolean get() {
        return false
    }
    val isScalene: Boolean get() {
        return false
    }
}
