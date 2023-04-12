package org.example.part_7_Collections.lesson39;

import org.example.part_7_Collections.lesson36.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(9, "Petr", "Petrov");
        Person sidr = new Person(3, "Sidr", "Sidrov");
        Person sveta = new Person(2, "Sveta", "Svetikova");

        Map<Integer, Person> map = new LinkedHashMap<>(500, 0.75f);
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sidr.getId(), sidr);
        map.putIfAbsent(sveta.getId(), sveta);

        for(Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.printf("Key=%d, value={%s}\n", entry.getKey(), entry.getValue());
        }

    }
}
