package org.example.part_7_Collections.lesson41_TreeMap;

import org.example.part_7_Collections.lesson36.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(9, "Petr", "Petrov");
        Person sidr = new Person(3, "Sidr", "Sidrov");
        Person sveta = new Person(2, "Sveta", "Svetikova");
        Person agafon = new Person(5, "Agafon", "Afonskij");
        Person sergej = new Person(7, "Sergej", "Sergeev");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sidr.getId(), sidr);
        map.put(agafon.getId(), agafon);
        map.put(sergej.getId(), sergej);
        map.putIfAbsent(sveta.getId(), sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
