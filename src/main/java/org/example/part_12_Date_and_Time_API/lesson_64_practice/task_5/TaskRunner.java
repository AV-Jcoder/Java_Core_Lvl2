package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 5.
 * Даны два объекта LocalDate из предыдущего задания.
 *
 * Подсчитать количество секунд между полуночью первой
 * даты и полуночью второй даты.
 */
public class TaskRunner {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018, 7, 7);


        LocalDateTime ldt1 = date1.atStartOfDay();
        LocalDateTime ldt2 = LocalDateTime.of(date2, LocalTime.MIDNIGHT);

        Duration duration = Duration.between(ldt2, ldt1);
        System.out.println("Duratioin between dates: " + duration.getSeconds());

    }
}
