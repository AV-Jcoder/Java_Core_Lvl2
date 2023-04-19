package org.example.part_9_functional_programming.lesson_51_map_reduce;

import java.util.stream.Stream;

public class MapReduceExample {

    /**
     * [1_000_000] -> age -> max
     *
     * [1_000_000] -> age -> max  ---> max
     *
     * [1_000_000] -> age -> max
     *
     */
    public static void main(String[] args) {
        // Поиск максимального значения.
        Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Kate"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        )
//                .parallel()
                .sequential()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

    }
}
