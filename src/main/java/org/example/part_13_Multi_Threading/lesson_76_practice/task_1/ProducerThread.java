package org.example.part_13_Multi_Threading.lesson_76_practice.task_1;

import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            synchronized (list) {
                while(true) {
                    if (list.size() < 10) {
                        int random = RandomUtil.getRandom();
                        list.add(random);
                        System.out.println("Producer add value: " + random + ". Size = " + list.size());
                    } else {
                        System.out.println("Producer does nothing. Size = " + list.size());
                    }
                    int waitRandom = RandomUtil.getRandom(5);
                    System.out.println("Producer wait: " + waitRandom);
                    list.notify();
                    list.wait(waitRandom);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
