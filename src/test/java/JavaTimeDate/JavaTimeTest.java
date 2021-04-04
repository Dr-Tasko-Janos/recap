package JavaTimeDate;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JavaTimeTest {

    @Test
    public void testLocalDateTime() {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate = LocalDate.now();
        assertThat(localDate.toString(), equalTo("2021-03-25"));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime1 = LocalTime.of(16,02);
        System.out.println(localTime1);
        assertThat(localTime1.toString(), equalTo("16:02"));

        LocalDate localDate2 = LocalDate.of(2022, 12,31);
        System.out.println(localDate2);
        assertThat(localDate2.toString(), equalTo("2022-12-31"));

        LocalDateTime localDateTime2 = LocalDateTime.of(2022, Month.JANUARY,31,12,15);
        System.out.println(localDateTime2);
        assertThat(localDateTime2.toString(), equalTo("2022-01-31T12:15"));

        LocalDateTime localDateTime3 = LocalDateTime.of(2020,Month.JANUARY, 01, 12, 00);
        LocalDateTime localDateTime4 = LocalDateTime.of(2020,Month.JANUARY, 01, 12, 00);

        System.out.println("localDateTime3: " + localDateTime3);
        System.out.println("localDateTime4: " + localDateTime4);
        assertThat(localDateTime3.toString(), equalTo(localDateTime4.toString()));

        localDateTime3 = localDateTime3.plusDays(1).plusMonths(1).plusYears(1).plusWeeks(1).plusHours(1).plusMinutes(1);
        assertThat(localDateTime3.toString(), equalTo("2021-02-09T13:01"));
        System.out.println("localDateTime3 after adding new time elements: " + localDateTime3);
        System.out.println("localDateTime3 required state after adding new time elements: \" 2021-02-09T13:01 \"");

        assertThat(localDateTime4.isBefore(localDateTime3), equalTo(true));
        assertThat(localDateTime3.isAfter(localDateTime4),equalTo(true));

    }

    @Test
    public void convertTimeAndDate() {

        LocalDateTime localDateTime = LocalDateTime.of(2021,Month.JANUARY, 31, 12, 15);

        LocalDate localDate = localDateTime.toLocalDate();
        assertThat(localDate.toString(), equalTo("2021-01-31"));

        LocalTime localTime = localDateTime.toLocalTime();
        assertThat(localTime.toString(), equalTo("12:15"));

        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        assertThat(localDateTime2.toString(), equalTo("2021-01-31T12:15"));
    }

    @Test
    public void testJavaUtilDate() {

        Date date = new Date();
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);
        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);
    }

    @Test
    public void testChronoUnit() {

        LocalDateTime localDateTime1 = LocalDateTime.of(2021,02,02,12,15);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,02,04,12,15);

        System.out.println(Math.abs(ChronoUnit.DAYS.between(localDateTime2, localDateTime1)));
        assertThat(ChronoUnit.DAYS.between(localDateTime1, localDateTime2), equalTo(2L));

        System.out.println(localDateTime1.getDayOfMonth() + " " + localDateTime1.getDayOfWeek());
    }

    @Test
    public void testFormat() {

    }

}




