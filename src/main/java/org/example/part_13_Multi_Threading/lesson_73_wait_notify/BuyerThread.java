package org.example.part_13_Multi_Threading.lesson_73_wait_notify;

import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class BuyerThread implements Runnable {

    private Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!cashBoxes.isEmpty()) {
                    CashBox cashBox = cashBoxes.remove();
                    System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashBox);
                    Thread.sleep(5L);
                    System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashBox);
                    cashBoxes.add(cashBox);
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " ожидает кассу.");
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
