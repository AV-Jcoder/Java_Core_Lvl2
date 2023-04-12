package org.example.part_5_OOPrinciple.lesson22;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom(){
        System.out.println("Random:" + generateRandom());
        print();
    }

    void print();

    private int generateRandom() {
        return RANDOM.nextInt();
    }

    static int genRand() {
        return RANDOM.nextInt();
    }
}
