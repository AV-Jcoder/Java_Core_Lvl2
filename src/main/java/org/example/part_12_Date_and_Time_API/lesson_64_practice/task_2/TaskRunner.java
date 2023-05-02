package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate,
 * представляющий собой сегодняшнюю дату.
 *
 * Преобразовать дату в строку вида "05.05.2017".
 *
 * Вывести эту строку на консоль.
 */
public class TaskRunner {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);

        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy ~ hh:mm:ss");
        String format2 = now2.format(formatter2);
        System.out.println(format2);


    }
}
