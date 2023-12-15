package org.ninrod.kotlin.pangram

object Pangram {
    fun isPangram(s: String): Boolean = s
            .lowercase()
            .toList()
            .containsAll("abcdefghijklmnopqrstuvwxyz".toSet())
}
