package date_time;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantTest {

    Instant timeStamp1;
    Instant timeStamp2;

    @Test
    void DurationOfInstnt() {
        timeStamp1 = Instant.now();
        System.out.println(timeStamp1.getNano());

        timeStamp2 = Instant.now().plusSeconds(7);
        Duration duration = Duration.between(timeStamp1,timeStamp2);

        System.out.println(duration.toSeconds());

        LocalDateTime dateTime = LocalDateTime.ofInstant(timeStamp1, ZoneId.systemDefault());
        System.out.println(dateTime);

    }

}
