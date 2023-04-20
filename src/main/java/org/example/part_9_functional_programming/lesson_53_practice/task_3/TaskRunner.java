package org.example.part_9_functional_programming.lesson_53_practice.task_3;

import java.util.Map;

/**
 *  *
 *  * 3. Дана Map<String, Integer>. Найти сумму всех
 *  * значений, длина ключей которых меньше 7
 *  * символов.
 */
public class TaskRunner {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "string1", 1,
                "strin2", 2,
                "string3", 3,
                "string4", 5,
                "strin5", 5
        );

        int sum = map.entrySet().stream()
                .filter(n -> n.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println(sum);

//        printSum(map);
    }

    private static void printSum(Map<String, Integer> map) {
        int result = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().length() < 7) {
                result += entry.getValue();
            }
        }
        System.out.println(result);
    }
}
