package org.ninrod.kotlin.rnatranscription

fun transcribeToRna(dna: String) = dna.map {mapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')[it]}.joinToString("")

