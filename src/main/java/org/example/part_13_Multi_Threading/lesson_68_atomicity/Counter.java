package org.example.part_13_Multi_Threading.lesson_68_atomicity;

public class Counter {

    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        count = count + 1;
    }

    public void decrement() {
        count = count - 1;
    }
}
