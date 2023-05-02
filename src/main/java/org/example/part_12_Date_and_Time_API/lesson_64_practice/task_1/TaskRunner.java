package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47.
 * Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */
public class TaskRunner {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2020, 06, 25, 19, 47);
        LocalDateTime plus = time.plus(3L, ChronoUnit.MONTHS);
        System.out.println("LocalDate plus: " + plus.toLocalDate());
        System.out.println("LocalTile plus: " + plus.toLocalTime());
    }
}
