package org.example.part_7_Collections.lesson40practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.example.part_7_Collections.lesson40practice.MarkLengthUtil.markLength4;

/**
 * Задача 1
 * Написать метод markLength4, принимающий в качестве параметра список (List) строк и
 * размещающий строку "****" перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 *
 * Например:
 *
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 *
 * ->
 *
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(list);
        System.out.println(list.size());
        markLength4(list);
        System.out.println(list);
    }

    private static void markLength(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i++, "****");
            }
        }
    }
}

final class MarkLengthUtil {

    private MarkLengthUtil(){}

    public static void markLength4(List<String> list) {
        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String line = iter.next();
            if (line.length() == 4) {
                iter.set("****"); // set at last return
                iter.add(line);   // add to cursor
            }
        }
    }
}