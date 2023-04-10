package org.example.lesson32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.contains(40));


        List<Integer> list2 = new LinkedList<>();
    }
}
