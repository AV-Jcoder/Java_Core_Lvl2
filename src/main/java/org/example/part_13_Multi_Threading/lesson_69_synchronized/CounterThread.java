package org.example.part_13_Multi_Threading.lesson_69_synchronized;

public class CounterThread implements Runnable {

    private final Counter counter;

    CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized(counter) {
                counter.increment();
            }
        }
    }
}
