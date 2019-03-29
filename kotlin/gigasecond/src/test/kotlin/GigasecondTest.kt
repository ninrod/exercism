import org.amshove.kluent.*
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

class GigasecondTest {
    private fun Gigasecond.check(year: Int,
                            month: Month,
                            day: Int,
                            hour: Int,
                            minute: Int,
                            second: Int) = with(this) {
        date?.shouldBeInYear(year)
        date?.shouldBeIn(month)
        date?.dayOfMonth?.`should be equal to`(day)
        date?.`should be in hour`(hour)
        date?.`should be in minute`(minute)
        date?.`should be in second`(second)
    }

    @Test
    fun jtime() {
        Gigasecond(LocalDate.of(2015,Month.MARCH, 27)).check(2046, Month.DECEMBER, 3, 1, 46, 40)
    }

    @Test
    fun atime() {
        Gigasecond(LocalDate.of(1982,Month.JANUARY, 25)).check(2013, Month.OCTOBER, 3, 1, 46, 40)
    }

    @Test
    fun modernTime() {
        Gigasecond(LocalDate.of(2011, Month.APRIL, 25)).check(2043, Month.JANUARY, 1, 1, 46, 40)
    }

    @Test
    fun afterEpochTime() {
        Gigasecond(LocalDate.of(1977, Month.JUNE, 13)).check(2009, Month.FEBRUARY, 19, 1, 46, 40)
    }

    @Test
    fun beforeEpochTime() {
        Gigasecond(LocalDate.of(1959, Month.JULY, 19)).check(1991, Month.MARCH, 27, 1, 46, 40)
    }

    @Test
    fun withFullTimeSpecified() {
        Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0)).check(2046, Month.OCTOBER, 2, 23, 46, 40)
    }

    @Test
    fun withFullTimeSpecifiedAndDayRollover() {
        Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59)).check(2046, Month.OCTOBER, 3, 1, 46, 39)
    }
}
