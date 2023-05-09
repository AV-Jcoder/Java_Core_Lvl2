package org.example.part_14_java_util_Concurrent.lesson_83_count_down_latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class RocketDetailCreator implements Runnable {

    private CountDownLatch latch;
    private RocketDetail detail;

    public RocketDetailCreator(CountDownLatch latch, RocketDetail detail) {
        this.latch = latch;
        this.detail = detail;
    }

    @Override
    public void run() {
        try {
            System.out.println("Готовится деталь: " + detail);
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("Деталь готова: " + detail);
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
