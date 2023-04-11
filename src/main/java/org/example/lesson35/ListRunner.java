package org.example.lesson35;

import java.util.Iterator;

public class ListRunner {

    public static void main(String[] args) {
        GenericList<String> genericList = new GenericList<>(10);
        genericList.add("String1");
        genericList.add("String2");
        genericList.add("String3");

        Iterator<String> iterator = genericList.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("String2")) {
                iterator.remove();
            }
        }

        for (String s : genericList) {
            System.out.println(s);
        }

        genericList.forEach(System.out::println);
        iterator.forEachRemaining(System.out::println);
    }
}
