package org.example.part_13_Multi_Threading.lesson_68_atomicity;

/**
 * Race condition:
 *
 * 1. считывание
 * 2. арифм.операцтя
 * 3. запись
 *
 *                1     2          3
 * поток1 ------> 8 -> 8+1 -> count=9;
 *
 * поток2 ------> 8 -> 8+1 -> count=9;
 *
 */
public class CounterRunner {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new CounterThread(counter), "A");
        Thread thread2 = new Thread(new CounterThread(counter), "B");
        Thread thread3 = new Thread(new CounterThread(counter), "C");
        Thread thread4 = new Thread(new CounterThread(counter), "D");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(counter.getCount());
    }
}
