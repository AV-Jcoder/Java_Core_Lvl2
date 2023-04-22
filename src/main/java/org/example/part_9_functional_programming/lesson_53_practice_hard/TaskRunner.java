package org.example.part_9_functional_programming.lesson_53_practice_hard;

import java.util.List;
import java.util.Map;

/**
 * Задание 1
 *
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 *
 *  Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 *
 *  1. Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 *
 *  2. Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 *
 *  3. Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 *
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Ivanov", 1, List.of(2,3,4,5,2,3,5)),
                new Student("Petr", "Petrov", 2, List.of(3,2,3,4,2,1,4,5)),
                new Student("Sveta", "Svetikova", 3, List.of(5,5,5)),
                new Student("Kate", "Ivanova", 3, List.of(4,4,4,4,3,4)),
                new Student("Slava", "Slavikov", 1, List.of(1,1,1,1,1,1,2)),
                new Student("Arni", "Kutuzov12324", 2, List.of(3,3,3,3,4,3,3))
        );
        System.out.println("1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Map<Integer, Double> map = StudUtils.filtredMap(students);
        System.out.println(map);
        System.out.println("2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Map<Integer, List<String>> integerListMap = StudUtils.GroupNamesByCourse(students);
        System.out.println(integerListMap);
        System.out.println("3~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Map<Integer, Statistic> mapWithStatistic = StudUtils.getMapWithStatistic(students);
        System.out.println(mapWithStatistic);
    }
}
