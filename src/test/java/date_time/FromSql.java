package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class FromSql {

    Date date;
    LocalDateTime dateTime;
    java.sql.Date dateSql;

    @Test
    void fromDate() {
        date= new Date();
        dateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(dateTime);
    }

    @Test
    void name() {
        dateSql = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = dateSql.toLocalDate();
        System.out.println(localDate);

    }
}
