package org.example.part_13_Multi_Threading.lesson_66;

import java.util.stream.IntStream;

public class ThreadDemo2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " start.");

        Thread thread = new Thread(new SimpleRunnable(), "Simple Runnable");
        Thread lambdaThread = new Thread(() -> IntStream
                .iterate(0, i -> i + 1)
                .limit(10)
                .mapToObj(n -> "j=" + n + ". Hello from lambda thread: " + Thread.currentThread().getName())
                .forEach(System.out::println), "Lambda Thread");

        thread.start();
        lambdaThread.start();

        thread.join();
        lambdaThread.join();

        System.out.println(Thread.currentThread().getName() + " finish.");
    }
}
