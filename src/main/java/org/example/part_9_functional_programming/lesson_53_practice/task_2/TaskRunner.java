package org.example.part_9_functional_programming.lesson_53_practice.task_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 *  * строк длиной более 8 символов.
 *  *
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16"
        );

        long count = strings.stream()
                .filter(str -> str.length() > 8)
                .distinct()
                .count();
        System.out.println(count);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        long count2 = strings.stream()
                .filter(str -> str.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(count2);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        printStrings(strings);
    }

    private static void printStrings(List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().length() > 8) {
                System.out.println(entry.getKey()+ " : " + entry.getValue());
            }
        }
    }
}
