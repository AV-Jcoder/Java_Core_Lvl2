package org.example.part_13_Multi_Threading.lesson_76_practice.task_1;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            synchronized (list) {
                while (true) {
                    if (!list.isEmpty()) {
                        Integer integer = list.remove();
                        System.out.println("Consumer get value: " + integer + ". Size = " + list.size());
                    } else {
                        System.out.println("Consumer waiting, list is empty.");
                    }
                    int random = RandomUtil.getRandom();
                    System.out.println("Consumer wait: " + random);
                    list.notify();
                    list.wait(random);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
