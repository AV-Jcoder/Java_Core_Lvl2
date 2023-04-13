package org.example.part_7_Collections.lesson40practice.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.part_7_Collections.lesson40practice.task1.MarkLengthUtil.markLength4;

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
public class MarkLengthDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(list);
        System.out.println(list.size());

        markLength4(list);

        System.out.println(list);
    }
}
