package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 4.1
 * Использовать LocalDateTime из предыдущего задания,
 * преобразовать его в объект типа Instant,
 * указав тайм зону "America/Chicago".
 * Вывести количество прошедших миллисекунд.
 *
 *
 * 4.2
 * Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату.
 *
 * Создать объект LocalDate, представляющий собой дату
 * 07.07.2018.
 *
 * Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class TaskRunner {

    public static void main(String[] args) {
        // Part 1
        String textDate = "26-03-1968T09:24";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(textDate, dtf);
        System.out.println("Parsed data: " + dateTime);

        ZoneId zoneId = ZoneId.of("America/Chicago");
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(dateTime);
        Instant instant = dateTime.toInstant(zoneOffset);
        long epochMilli = instant.toEpochMilli();
        System.out.println("Epoch millis: " + epochMilli);

        // Part 2
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018, 7, 7);
        Period period = Period.between(date1, date2);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        long between = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days from Chronounit: " + between);
    }
}
