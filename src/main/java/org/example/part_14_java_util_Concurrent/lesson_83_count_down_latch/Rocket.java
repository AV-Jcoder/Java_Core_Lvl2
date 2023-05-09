package org.example.part_14_java_util_Concurrent.lesson_83_count_down_latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {

    private CountDownLatch latch;

    public Rocket(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Ракета готовится к запуску.");
            latch.await();
            System.out.println("Пуск.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
