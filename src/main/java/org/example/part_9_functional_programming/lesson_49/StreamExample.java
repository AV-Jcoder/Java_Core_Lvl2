package org.example.part_9_functional_programming.lesson_49;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(integer -> integer % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~");
        Integer i = strings.stream()
                .map(Integer::valueOf)
                .filter(num -> num % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)
                .get();
        System.out.println(i);





//        for (String string : strings) {
//            String value = string + string;
//            Integer integer = Integer.parseInt(value);
//            if (integer % 2 == 0) {
//                System.out.println(integer);
//            }
//        }
    }


}
