package org.example.part_7_Collections.lesson34;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorRunner {

    public static void main(String[] args) {

        // Initialize

        long startTime;
        long endTime;
        long initTime;
        long foriTime;
        long foreTime;
        long iterTime;
        int count = 100_000;
        List<Integer> list = new LinkedList<>();
//        List<Integer> list = new ArrayList<>(10);

        // add element to list

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        endTime = System.currentTimeMillis();
        initTime = endTime - startTime;


        Iterator<Integer> iterator = list.listIterator();

        // read FOR-I

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println("Fori: " + list.get(i));
        }
        endTime = System.currentTimeMillis();
        foriTime = endTime -startTime;

        // read FOR-E

        startTime = System.currentTimeMillis();
        for (Integer i : list) {
            System.out.println("Fore: " + i);
        }
        endTime = System.currentTimeMillis();
        foreTime = endTime - startTime;

        // read ITER

        startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            System.out.println("Iter: " + iterator.next());
        }
        endTime = System.currentTimeMillis();
        iterTime = endTime - startTime;


        //////////////////////////////////////////////////////////////////

        System.out.println("Time init:" + initTime + " ms");
        System.out.println("Time fori:" + foriTime + " ms");
        System.out.println("Time fore:" + foreTime + " ms");
        System.out.println("Time iter:" + iterTime + " ms");



    }
}
