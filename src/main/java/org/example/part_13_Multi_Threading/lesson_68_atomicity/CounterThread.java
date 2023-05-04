package org.example.part_13_Multi_Threading.lesson_68_atomicity;

public class CounterThread implements Runnable {

    private final Counter counter;

    CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
