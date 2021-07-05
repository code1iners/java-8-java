package main.java.hello.codeliner.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeExample {

    public static void instantBasic() {
        System.out.println("instantBasic");
        Instant instant = Instant.now();
        System.out.println("instant : " + instant);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println("zone : " + zone);
    }

    public static void instantWithAtZone() {
        System.out.println("instantWithAtZone");
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println("zonedDateTime = " + zonedDateTime);
    }

    public static void localDateTimeBasic() {
        System.out.println("localDateTimeBasic");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    public static void localDateTimeWithPeriod() {
        System.out.println("localDateTimeOf");
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2021, Month.AUGUST, 31);
        System.out.println("startDate:" + startDate);
        System.out.println("endDate:" + endDate);
        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("years:" + years);
        System.out.println("months:" + months);
        System.out.println("days:" + days);

        long untilTime = startDate.until(endDate, ChronoUnit.DAYS);
        System.out.println("untilTime = " + untilTime);
    }

    public static void instantWithDuration() {
        System.out.println("instantWithDuration");
        Instant startDate = Instant.now();
        Instant after3Seconds = startDate.plus(3, ChronoUnit.SECONDS);
        System.out.println("startDate:" + startDate);
        System.out.println("after3Second:" + after3Seconds);
        // Duration.between(startDate, endDate);
        Duration between = Duration.between(startDate, after3Seconds);
        long betweenLong = between.get(ChronoUnit.SECONDS);
        System.out.println("betweenLong = " + betweenLong);
    }

    public static void instantToLocalDateTime() {
        System.out.println("instantToLocalDateTime");
        Instant now = Instant.now();
        LocalDateTime localDateTime = now.atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);
    }

    public static void localDateTimeToInstant() {
        System.out.println("localDateTimeToInstant");
        LocalDateTime now = LocalDateTime.now();
        Instant instant = now.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("instant = " + instant);
    }

    public static void zonedDateTime() {
        System.out.println("zonedDateTime");
        ZonedDateTime korea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("korea = " + korea);
    }

    public static void zonedDateTimeToInstant() {
        System.out.println("zonedDateTimeToInstant");
        ZonedDateTime now = ZonedDateTime.now();
        Instant instant = now.toInstant();
        System.out.println("instant = " + instant);
    }

    public static void formatter() {
        System.out.println("formater");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatted = now.format(MMddyyyy);
        System.out.println("formatted = " + formatted);

        // note. parse.
        LocalDate parsed = LocalDate.parse("07/05/2021", MMddyyyy);
        System.out.println("parsed = " + parsed);
    }

    public static void convertWithLegacy() {
        System.out.println("convertWithLegacy");
        Date date = new Date();
        System.out.println("date = " + date);
        Instant instant = date.toInstant();
        System.out.println("instant = " + instant);
        Date newDate = Date.from(instant);
        System.out.println("newDate = " + newDate);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime zonedDateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar newGregorianCal = GregorianCalendar.from(zonedDateTime);

        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        System.out.println("zoneId = " + zoneId);
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println("timeZone = " + timeZone);
    }
}