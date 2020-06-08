package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateModifyTest {
    LocalDate date;

    @Test
    void modify() {
        date = LocalDate.now();
        System.out.println(date.plusDays(4));
        System.out.println(date.plusMonths(1000));
        System.out.println(date.minusDays(8711));
        System.out.println(date.withDayOfMonth(19));
        System.out.println(date);
    }

    @Test
    void modfyWithChronoField() {
        date = LocalDate.now();
        System.out.println(date.with(ChronoField.DAY_OF_MONTH,19));
        System.out.println(date.with(TemporalAdjusters.firstDayOfYear()));

    }
}
