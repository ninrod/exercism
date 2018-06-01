class Matrix (matrix: List<List<Int>>) {
    val saddlePoints: Set<MatrixCoordinate> get() {

        return setOf(MatrixCoordinate(0, 0))
    }
}

fun main(args: Array<String>) {
    val matrix = Matrix(listOf(
            listOf(9, 8, 7),
            listOf(5, 3, 2),
            listOf(6, 6, 7)
    ))

}