package date_time;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {

    LocalDateTime dateTime1;
    LocalDateTime dateTime2;

    @Test
    void durationWithTwoDateTimes() {
        dateTime1 = LocalDateTime.now();
        dateTime2 = LocalDateTime.now().plusHours(1);

        Duration duration = Duration.between(dateTime1,dateTime2);
        System.out.println(duration.toHours());
    }

    @Test
    void durationTime() {
        Duration duration = Duration.of(15000, ChronoUnit.DAYS);
        System.out.println(duration);
    }

    @Test
    void name() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(1);

        Duration duration = Duration.between(date1,date2);

        System.out.println(duration);
    }
}
