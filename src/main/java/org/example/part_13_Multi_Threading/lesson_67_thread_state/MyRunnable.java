package org.example.part_13_Multi_Threading.lesson_67_thread_state;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i=" + i + ". Thread:" + Thread.currentThread().getName() + ".");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
