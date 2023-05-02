package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_7;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 7. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */
public class TaskRunner {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime adjustDateTime = ldt.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(adjustDateTime);

    }
}
