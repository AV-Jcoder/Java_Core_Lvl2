package org.example.part_9_functional_programming.lesson_48;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
//        Comparator<Integer> comparator = (a, b) -> a > b ? 1 : (a == b ? 0 : -1);
//        Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);
        Comparator<Integer> comparator = Integer::compare;
        int result = comparator.compare(-6, -5);
        System.out.println(result);
    }


}

//class IntegerComparator implements Comparator<Integer> {


//    @Override
//[модификаторы] возвр.тип название([параметры])
//    public       int      compare(Integer a, Integer b) {
//        return a > b ? 1 : (a == b ? 0 : -1);
//    }

// Запись для объявления метода можно сократить до вида:
//    (Integer a, Integer b) -> {
//        return a > b ? 1 : (a == b ? 0 : -1);
//    }

//    (a, b) -> a > b ? 1 : (a == b ? 0 : -1);

//}
