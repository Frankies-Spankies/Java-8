package date_time;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.*;

public class ZoneTest {

    @Test
    void getAllZoneId() {
        ZoneId.getAvailableZoneIds().stream().
                sorted()
                .filter(z -> z.contains("Mexico"))
                .forEach(System.out::println);
    }

    @Test
    void getDurationBtwenZones() {
        ZonedDateTime zoneDateTime1 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime zoneDateTime2 = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
        System.out.println(zoneDateTime1);
        System.out.println(zoneDateTime2);

        Duration duration = Duration.between(zoneDateTime2.toLocalDateTime(),zoneDateTime1.toLocalDateTime());
        System.out.println(duration.toHours());
    }

    @Test
    //@Disabled
    void LocalDateTimeToZoneDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("Europe/Madrid"));
        System.out.println(zonedDateTime);
        System.out.println(dateTime.atOffset(ZoneOffset.of("-10")));
    }
}
