package org.example.part_9_functional_programming.lesson_50_mapToInt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntExample {

    public static void main(String[] args) {
        List<String> list = List.of("88", "11", "22", "33", "44", "55", "66");
        list.stream()
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
//                .summaryStatistics());
                .mapToObj(Integer::valueOf);

        Stream.of(1,2,3,4,5,6,7)
                .peek(System.out::println)
                .collect(Collectors.toList());
//                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        IntStream.range(1,10)
                .forEach(System.out::print);

        System.out.println("\n~~~~~~~~~~~");

        IntStream.iterate(0, n -> n + 3)
                .skip(10)
                .limit(20)
                .forEach(n -> System.out.print(n + " "));


    }
}
