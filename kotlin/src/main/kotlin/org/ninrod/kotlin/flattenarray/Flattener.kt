package org.ninrod.kotlin.flattenarray

object Flattener {
    fun flatten(list: List<Any?>): List<Any?> = list.flatMap {
            when(it) {
                null -> emptyList<Any>()
                !is Iterable<*> -> listOf(it)
                else -> flatten(it as List<*>)
            }
        }
}
