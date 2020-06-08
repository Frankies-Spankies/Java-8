package date_time;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class IntroDateTimeTest {

    @Test
    void simpleDateFormater() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(date));
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        System.out.println(df.format(date));
        System.out.println(Calendar.getInstance().getTime());

    }

    @Test
    void LocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }

    @Test
    void LocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }

    @Test
    void LocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
