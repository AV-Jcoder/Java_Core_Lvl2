package org.example.part_7_Collections.lesson40practice.task2;

import java.util.*;

public class StudentUtil {

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Ivanov", "Ivan",19, 4.2),
                new Student("Petrov", "Petr",20, 4.3),
                new Student("Sidorov", "Sidor",21, 4.4),
                new Student("Ignashevich", "Ivan",23, 4.0),
                new Student("Zarubin", "Zarub",22, 4.5)
        );
    }

    public static void sortStudents(List<Student> list) {
        Collections.sort(list, Comparator.comparing(Student::getFirstName)
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getAge)
                .thenComparing(Student::getAvgMark));
    }

    public static Student getMaxAvgMark(List<Student> list) {
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
