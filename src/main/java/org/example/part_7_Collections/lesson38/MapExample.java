package org.example.part_7_Collections.lesson38;

import org.example.part_7_Collections.lesson36.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sidr = new Person(3, "Sidr", "Sidrov");
        Person sveta = new Person(1, "Sveta", "Svetikova");

        Map<Integer, Person> map = new HashMap<>(500, 0.75f);
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sidr.getId(), sidr);
        map.put(sveta.getId(), sveta);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Integer=5. HashCode of 5=" + Integer.hashCode(5));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Key set:\n" + map.keySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Values:\n" + map.values());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Entry set:\n" + map.entrySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Iterate keySet:");
        for (Integer integer : map.keySet()) {
            System.out.println("key=" + integer);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Iterate values:");
        for (Person value : map.values()) {
            System.out.println(value.getLastName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Iterate entrySet:");
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue().getLastName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(ivan));
        System.out.println(map.containsValue(sveta));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(5, new Person(-1, "Anon", "Anonovich")));


    }
}