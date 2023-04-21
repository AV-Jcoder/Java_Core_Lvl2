package org.example.part_9_functional_programming.lesson_53_practice.task_4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 4. Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию
 * строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 *
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);
        integers.stream()
                .map(String::valueOf)
                .reduce(String::concat)
                .ifPresent(System.out::println);


        String concat = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(concat);

    }
}
