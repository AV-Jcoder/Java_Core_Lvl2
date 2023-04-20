package org.example.part_9_functional_programming.lesson_52_optional;

import org.example.part_9_functional_programming.lesson_51_map_reduce.Student;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OptionalExample {

    public static void main(String[] args) {

        // Поставщик стримов из студентов.
        Supplier<Stream<Student>> supplier = () -> Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Kate"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        );

        // Найти студентов с возрастом меньше 18.
        Stream<Student> students18Less = supplier.get()
                .filter(stud -> stud.getAge() < 18);

        // Найти студента с максимальным воззрастом
        Optional<Student> studMaxYear = supplier.get()
                .reduce((stud1, stud2) -> stud1.getAge() > stud2.getAge() ? stud1 : stud2);

        // Вывести на дисплей результат поиска
        studMaxYear.ifPresentOrElse(System.out::println, () -> System.out.println("Not present"));

        // lazy init при отсутствующем значении
        Student stud = supplier.get()
                .filter(n -> n.getAge() < 8)
                .reduce((a,b) -> a.getAge() > b.getAge() ? a : b) // оставить одного студента с MAX воззрастом(т.е. 8 лет, т.е. null)
                .orElseGet(Student::new);
        System.out.println(stud);

        // Конвертация опшенолов.
        Student dummy = new Student();
        Optional<Student> optStud = Optional.of(dummy);
        Optional<Stream<Integer>> optStream = optStud.flatMap(n -> Optional.of(n.getMarks().stream()));
        Stream<Integer> marks = optStream.orElseGet(() -> Stream.of((-1)));
        marks.forEach(System.out::println);

        Optional<Integer> opt = Optional.of(null);
        opt.or(() -> Optional.of(2));
    }
}
