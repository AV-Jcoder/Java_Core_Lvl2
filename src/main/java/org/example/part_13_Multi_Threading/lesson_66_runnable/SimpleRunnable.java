package org.example.part_13_Multi_Threading.lesson_66_runnable;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i + ". Hello from concurrent thread : " + Thread.currentThread().getName());
        }
    }
}
