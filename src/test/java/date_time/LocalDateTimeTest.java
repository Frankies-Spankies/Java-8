package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeTest {

    LocalDateTime dateTime;

    @Test
    void now() {
        dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

    @Test
    void create() {
        dateTime = LocalDateTime.of(1996,8,1,1,15,1);
        System.out.println(dateTime);

        LocalDate date = LocalDate.of(1996,8,1);
        LocalTime time = LocalTime.of(1,15,1);

        dateTime = LocalDateTime.of(date,time);
        System.out.println(dateTime);
    }

    @Test
    void get() {
        dateTime = LocalDateTime.of(1996,8,1,1,15,1);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));
    }

    @Test
    void toLocalDate() {
        dateTime = LocalDateTime.of(1996,8,1,1,15,1);
        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.toLocalTime());
    }
}
