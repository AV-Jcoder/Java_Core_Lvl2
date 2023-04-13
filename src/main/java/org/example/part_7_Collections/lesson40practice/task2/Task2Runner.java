package org.example.part_7_Collections.lesson40practice.task2;

import java.util.*;

import static org.example.part_7_Collections.lesson40practice.task2.StudentUtil.*;

/**
 * Задача 2
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким
 * средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия),
 * возрасту и среднему баллу, используя компараторы.
 */
public class Task2Runner {

    public static void main(String[] args) {
        List<Student> list = getStudents();
        System.out.println(getMaxAvgMark(list));
        sortStudents(list);
        System.out.println(list);
    }
}
