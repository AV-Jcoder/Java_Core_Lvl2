package org.example.part_9_functional_programming.lesson_53_practice.task_1;

import java.util.List;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 *
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
        integers.stream()
                .filter(num -> num % 2 != 0 && num % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not present"));
    }
}
