package org.example.part_7_Collections.lesson44_tasks.task2;

import java.util.*;

/**
 * Написать метод countUnique, который принимает целочисленный список в качестве параметра
 * и возвращает количество уникальных целых чисел в этом списке.
 * При получении пустого списка метод должен возвращать 0;
 *
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<Integer> list = List.copyOf(List.of(1,1,1,1,1,1,1,1,2,2,3,4,4,5,5,6,12));
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list);
        int countUniqueOfList1 = countUnique(list);
        System.out.println(countUniqueOfList1);
    }

    /**
     * Метод, который считает и возвращает количество чисел,
     * у которых отсутствуют дубликаты.
     * Т.е. передав исходный массив
     * [3,7,3,-1,2,3,7,2,15,15]
     * метод вернёт 1.
     * @param list
     * @return
     */
    private static int countUnique(List<Integer> list) {
        int count = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.put(integer, false);
            } else {
                map.put(integer, true);
            }
        }
        for (Boolean trust : map.values()) {
            if (trust) {
                count++;
            }
        }
        return count;
    }

    /**
     * Метод возвращает количество уникальных целых чисел
     * в переданном списке.
     * @param list
     * @return
     */
    private static int getCountUnique(List<Integer> list) {
        return new HashSet<Integer>(list).size();
    }
}
