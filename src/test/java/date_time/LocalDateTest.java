package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest {

    LocalDate date;

    @Test
    void createLocalDate() {
        date = LocalDate.now();
        System.out.println(date);
    }

    @Test
    void usingTheYear() {
        date = LocalDate.ofYearDay(2020,70);
        System.out.println(date);
    }

    @Test
    void usigOf() {
        date = LocalDate.of(1996,8,1);
        System.out.println(date);
        date = LocalDate.of(1996, Month.AUGUST, 1);
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());

    }

    @Test
    void usingGet() {
        date = LocalDate.of(1996,8,1);
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));
    }
}
