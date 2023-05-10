package org.example.part_14_java_util_Concurrent.lesson_85_semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;
    private Semaphore semaphore;

    public BuyerThread(Queue<CashBox> cashBoxes, Semaphore semaphore) {
        this.cashBoxes = cashBoxes;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            CashBox cashBox = cashBoxes.remove();
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashBox);
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashBox);
            cashBoxes.add(cashBox);
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(Thread.currentThread().getName() + " заканчивает работу.");
    }
}
