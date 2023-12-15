package org.ninrod.kotlin.gigasecond

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

class Gigasecond constructor(localDatetime: LocalDateTime) {
    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())
    val date: LocalDateTime? = localDatetime.plusSeconds(1000000000)

}

fun main() {
    val d = LocalDate.of(1982, Month.JANUARY, 25)
    val g = Gigasecond(d)
    print(g.date)
}

