package org.example.part_9_functional_programming.lesson_53_practice_hard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

    public static Map<Integer, Statistic> getMapWithStatistic(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(groupingBy(Student::getCourse,
                        collectingAndThen(toList(), studs -> {
                            List<String> studsFullName = studs.stream()
                                    .map(stud -> stud.getFirstName() + " " + stud.getLastName())
                                    .collect(toList());
                            double avgAllMarks = studs.stream()
                                    .mapToDouble(stud -> avgMark(stud))
                                    .summaryStatistics()
                                    .getAverage();
                            Statistic statistic =  new Statistic(studsFullName, avgAllMarks);
                            return statistic;
                        })
                        )
                );
    }
}
