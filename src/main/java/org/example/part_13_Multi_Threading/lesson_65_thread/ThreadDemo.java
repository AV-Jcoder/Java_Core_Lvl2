package org.example.part_13_Multi_Threading.lesson_65_thread;

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " start:");
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();

        try {
            System.out.println("main joined:");
            simpleThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " finish.");
    }
}
