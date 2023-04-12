package org.example.part_5_OOPrinciple.lesson23;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom(){
        System.out.println(RANDOM.nextInt());
        print();
    }

    void print();
}
