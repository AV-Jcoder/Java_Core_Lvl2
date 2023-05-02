package org.example.part_12_Date_and_Time_API.lesson_63;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class DateAndTimeDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Locale date: " + date + "\n");

        LocalTime localTime = LocalTime.now();
        System.out.println("Local time: " + localTime + "\n");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime + "\n");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime + "\n");

        Instant instant = Instant.now();
        System.out.println("Instant: " + instant + "\n");

        Instant zonedToInstant = zonedDateTime.toInstant();
        System.out.println("Zoned to Instant: " + zonedToInstant + "\n");

        long epochMillis = zonedToInstant.toEpochMilli();
        System.out.println("EpochMillis: " + epochMillis);
        System.out.println("Epoch years: " + epochMillis/1000/60/60/24/365 + "\n");

        ZonedDateTime shiftedOn2Days = zonedDateTime.plus(2L, TimeUnit.DAYS.toChronoUnit());
        System.out.println("Shifted on 2 days: " + shiftedOn2Days + "\n");

        ZonedDateTime shiftedOn2Weeks = zonedDateTime.plus(2L, ChronoUnit.WEEKS);
        System.out.println("Shifted on 2 weeks: " + shiftedOn2Weeks + "\n");

        ZonedDateTime truncatedToDays = zonedDateTime.truncatedTo(ChronoUnit.DAYS);
        System.out.println("TruncatedToDays: " + truncatedToDays + "\n");

        int second = zonedDateTime.getSecond();
        System.out.println("Get second: " + second + "\n");

        LocalDateTime UTCTime = LocalDateTime.now(Clock.systemUTC());
        System.out.println("UTC time:" + UTCTime + "\n");

        LocalDateTime UTCTime2 = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println("UTC Time2: " + UTCTime2 + "\n");

    }
}
