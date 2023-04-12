package org.example.part_7_Collections.lesson37;

import org.example.part_7_Collections.lesson36.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(petr.getId(), ivan);

        System.out.println(map.get(1));
        System.out.println(map.get(2));

        System.out.println(Integer.hashCode(5));
    }
}
