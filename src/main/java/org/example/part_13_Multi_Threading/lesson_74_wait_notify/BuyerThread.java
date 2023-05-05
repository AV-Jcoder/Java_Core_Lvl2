package org.example.part_13_Multi_Threading.lesson_74_wait_notify;

import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {

            synchronized (cashBoxes) {

                while (true) {

                    if (!cashBoxes.isEmpty()) {
                        TimeUnit.SECONDS.sleep(1);
                        CashBox cashBox = cashBoxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashBox);
                        cashBoxes.wait(500);
                        System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashBox);
                        cashBoxes.add(cashBox);
                        cashBoxes.notifyAll();
                        break;
                    }  else {
                        System.out.println(Thread.currentThread().getName() + " ожидает кассу.");
                        cashBoxes.wait(2000);
                    }

                }

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(Thread.currentThread().getName() + " заканчивает работу.");
    }
}
