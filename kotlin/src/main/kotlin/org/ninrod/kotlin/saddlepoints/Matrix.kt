package org.ninrod.kotlin.saddlepoints

data class Matrix (val matrix: List<List<Int>>) {
    val saddlePoints: Set<MatrixCoordinate> get() {
        val s =  HashSet<MatrixCoordinate>()
        matrix.forEachIndexed { i, list ->
            list.forEachIndexed { j, e ->
                val mc = MatrixCoordinate(i, j)
                val maxRow = matrix[i].max()
                val minCol = matrix.map { it[j] }.min()
                if (e == maxRow && e == minCol) s.add(mc)
            }
        }
        return s
    }
}
