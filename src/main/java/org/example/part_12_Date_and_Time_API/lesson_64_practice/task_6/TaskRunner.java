package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_6;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

/**
 * 6.
 * Создать объект Instant.
 * Вывести его на консоль.
 * Затем создать объект ZonedDateTime
 * на основании предыдущего объекта
 * с тайм зоной "Africa/Cairo".
 */
public class TaskRunner {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZoneId zoneId = ZoneId.of("Africa/Cairo");
        ZoneRules zoneRules = zoneId.getRules();
        ZoneOffset zoneOffset = zoneRules.getOffset(instant);
        ZonedDateTime zonedDateTime = instant.atZone(zoneOffset);
    }
}
