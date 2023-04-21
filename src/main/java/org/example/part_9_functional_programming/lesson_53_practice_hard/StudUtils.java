package org.example.part_9_functional_programming.lesson_53_practice_hard;

import org.exampl1e.part_9_functional_programming.lesson_53_practice_hard.Student;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class StudUtils {

    private StudUtils() {}

    public static double avgMark(Student stud) {
        return stud.getMarks().stream()
                .mapToDouble(Double::valueOf)
                .average()
                .orElse(0.0);
    }

    public static Map<Integer, Double> filtredMap(List<Student> list) {
        return list.stream()
                .filter(stud -> stud.getMarks().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourse,Collectors.averagingDouble(StudUtils::avgMark)));
    }

    public static Map<Integer,List<String>> GroupNamesByCourse(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.mapping(Student::getFullName, Collectors.toList())));

    }

    public static List<Student> fullNameSort(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.toList());
    }





}
