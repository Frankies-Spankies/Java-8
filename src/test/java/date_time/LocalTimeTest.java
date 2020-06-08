package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest {

    LocalTime time;

    @Test
    void create() {
        time = LocalTime.now();
        System.out.println(time);
        System.out.println(LocalTime.of(7,7));
        System.out.println(LocalTime.of(7,7,7));
        System.out.println(LocalTime.of(7,7,7,777777777));
    }

    @Test
    void get() {
        time = LocalTime.now();
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }

    @Test
    void withCronofield() {
        time = LocalTime.now();
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(time.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(time.get(ChronoField.SECOND_OF_MINUTE));
    }
}
