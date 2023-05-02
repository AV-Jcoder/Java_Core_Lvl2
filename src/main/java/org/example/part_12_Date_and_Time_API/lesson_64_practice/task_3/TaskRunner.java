package org.example.part_12_Date_and_Time_API.lesson_64_practice.task_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 */
public class TaskRunner {

    public static void main(String[] args) {
        String textDate = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(textDate, formatter);
        System.out.println(dateTime);
    }
}
