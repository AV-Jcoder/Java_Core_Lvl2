package org.example.part_14_java_util_Concurrent.lesson_82_concurrent_collections;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BuyerThread implements Runnable {

    private final BlockingQueue<CashBox> cashBoxes;

    public BuyerThread(BlockingQueue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            CashBox cashBox = cashBoxes.take();
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashBox);
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashBox);
            cashBoxes.put(cashBox);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(Thread.currentThread().getName() + " заканчивает работу.");
    }
}
