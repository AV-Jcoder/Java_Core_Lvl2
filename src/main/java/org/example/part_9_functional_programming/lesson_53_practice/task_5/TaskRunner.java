package org.example.part_9_functional_programming.lesson_53_practice.task_5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  * 5. Дан класс Person с полями firstName, lastName,
 *  * age.
 *  * Вывести полное имя самого старшего человека, у
 *  * которого длина этого имени не превышает 15
 *  * символов.
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 45),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12324", 56)
        );

        persons.stream()
                .filter(pers -> pers.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);


        Map<Integer, List<Person>> collect = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(collect);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Map<Integer, List<String>> collect1 = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getFullName, Collectors.toList())));
    }
}
