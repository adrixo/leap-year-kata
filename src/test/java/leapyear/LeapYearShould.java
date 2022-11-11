package leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearShould {

    @ParameterizedTest
    @CsvSource({
            "1997",
            "1998",
            "1999"
    })
    public void
    a_non_leap_year_shouldnt_be_divisible_by_4(int year) {
        assertFalse(LeapYear.is(year));
    }

    @ParameterizedTest
    @CsvSource({
            "2000",
            "2004",
            "1996"
    })
    public void
    a_leap_year_is_divisible_by_4(int year) {
        assertTrue(LeapYear.is(year));
    }

    @ParameterizedTest
    @CsvSource({
            "400",
            "800",
            "1200",
            "1600",
            "2000"
    })
    public void
    a_leap_year_is_divisible_by_400(int year) {
        assertTrue(LeapYear.is(year));
    }

    @ParameterizedTest
    @CsvSource({
            "1400",
            "1800",
    })
    public void
    a_leap_year_is_not_divisible_by_100_but_400(int year) {
        assertFalse(LeapYear.is(year));
    }
}