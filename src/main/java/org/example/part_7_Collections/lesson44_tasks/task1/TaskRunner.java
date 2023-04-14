package org.example.part_7_Collections.lesson44_tasks.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Написать метод, который принимает список и возвращает
 * целочисленный список только с нечётными ззначениями.
 */
public class TaskRunner {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

//        doOddList(list);

        List<Integer> oddList = getOddList(list);
        System.out.println(oddList);

    }

    /**
     * Так делать не надо! Потому что!
     * Во первых может быть передана immutable collection, List.of(1,2,3,3,4,5);
     * Во вторых может быть передана кастрированная версия ArrayList из класса Arrays.asList(), кидающая UnsupportedOperationException();
     * Во третьих мы изменяем исходныую коллекцию. Это может вызывать ошибки, типа ConcurrentModificationException.
     * Поэтому из исходной структуры данные только считываются или копируются в новую.
     * @param list
     */
    private static void doOddList(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i % 2 == 0) {
                iter.remove();
            }
        }
    }

    /**
     * Так делать правильно! Копируем нужные данные в новую структуру.
     */
    private static List<Integer> getOddList(List<Integer> list) {
        List<Integer> oddList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                oddList.add(integer);
            }
        }
        return oddList;
    }
}
