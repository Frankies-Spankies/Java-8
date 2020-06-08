package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TimeModify {

    LocalTime time;

    @Test
    void modify() {
        time = LocalTime.now();
        System.out.println(time.plusHours(1));
        System.out.println(LocalTime.MIDNIGHT);
    }

    @Test
    void name() {
        time = LocalTime.now();
        System.out.println(time.with(ChronoField.HOUR_OF_DAY,17));
    }
}
