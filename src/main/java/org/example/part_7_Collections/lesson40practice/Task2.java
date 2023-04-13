package org.example.part_7_Collections.lesson40practice;

import java.util.*;

/**
 * Задача 2
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким
 * средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия),
 * возрасту и среднему баллу, используя компараторы.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Ivanov", "Ivan",19, 4.2),
                new Student("Petrov", "Petr",20, 4.3),
                new Student("Sidorov", "Sidor",21, 4.4),
                new Student("Ignashevich", "Ivan",23, 4.0),
                new Student("Zarubin", "Zarub",22, 4.5)
        );
        System.out.println(getMaxAvgMark(list));

        sortStudents(list);

        System.out.println(list);


    }

    private static void sortStudents(List<Student> list) {
        Collections.sort(list, Comparator.comparing(Student::getFirstName)
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getAge)
                .thenComparing(Student::getAvgMark));
    }

    private static Student getMaxAvgMark(List<Student> list) {
        Student studentWithMaxMark = list.get(0);
        double maxMark = studentWithMaxMark.getAvgMark();
        ListIterator<Student> iter = list.listIterator();
        while(iter.hasNext()) {
            Student stud = iter.next();
            if (maxMark < stud.getAvgMark()) {
                studentWithMaxMark = stud;
                maxMark = stud.getAvgMark();
            }
        }
        return studentWithMaxMark;
    }
}

class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double avgMark;

    public Student(String firstName, String lastName, int age, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.avgMark = avgMark;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Student:\n%s %s, age=%d, average mark=%.2f",lastName, firstName, age, avgMark);
    }
}
