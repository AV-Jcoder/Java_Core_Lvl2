package org.example.part_14_java_util_Concurrent.lesson_84_cyclic_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class RocketDetailCreator implements Runnable {

    private CyclicBarrier barrier;
    private RocketDetail detail;

    public RocketDetailCreator(CyclicBarrier barrier, RocketDetail detail) {
        this.barrier = barrier;
        this.detail = detail;
    }

    @Override
    public void run() {
        try {
            System.out.println("Готовится деталь: " + detail);
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("Деталь готова и ожидает: " + detail);
            barrier.await();
            System.out.println("Деталь использована: " + detail);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
