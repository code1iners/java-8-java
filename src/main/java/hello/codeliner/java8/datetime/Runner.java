package main.java.hello.codeliner.java8.datetime;

public class Runner {
    
    public static void main(String[] args) {

        // note. Instant.
        DateTimeExample.instantBasic();
        DateTimeExample.instantWithAtZone();
        DateTimeExample.localDateTimeBasic();
        DateTimeExample.localDateTimeWithPeriod();
        DateTimeExample.instantWithDuration();
        DateTimeExample.instantToLocalDateTime();
        DateTimeExample.localDateTimeToInstant();
        DateTimeExample.zonedDateTime();
        DateTimeExample.zonedDateTimeToInstant();
        DateTimeExample.formatter();
        DateTimeExample.convertWithLegacy();
    }
}
