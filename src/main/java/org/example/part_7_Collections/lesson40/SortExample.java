package org.example.part_7_Collections.lesson40;

import org.example.part_7_Collections.lesson36.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
//        List<String> strings = List.of("123", "345", "14", "678");
        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> people = Arrays.asList(
                new Person(11, "Ivan", "Ivanov"),
                new Person(1, "Ivan", "Zarubin"),
                new Person(9, "Petr", "Petrov"),
                new Person(3, "Sidr", "Sidrov"),
                new Person(2, "Sveta", "Svetikova")
        );
        System.out.println(people);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Collections.sort(people);
        System.out.println(people);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Collections.sort(people, new FirstNameComparator());
        System.out.println(people);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Collections.sort(people, Comparator.comparing(Person::getLastName));
        System.out.println(people);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Collections.sort(people, Comparator.comparing(Person::getFirstName).thenComparing(Person::getId));
        System.out.println(people);

    }


    public static class FirstNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

}
