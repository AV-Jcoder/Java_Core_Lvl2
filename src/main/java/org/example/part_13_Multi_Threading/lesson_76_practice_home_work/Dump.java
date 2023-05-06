package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * Свалка запчастей. Сама себе генерирует запчасти.
 */
public class Dump extends Thread {

    private Queue<Part> parts;

    public Dump() {
        this.parts = RandomUtils.getRandomStartPackParts();
    }

    private void addRandomDayPackParts() {
        parts.addAll(RandomUtils.getRandomDayPack());
    }

    public Queue<Part> findPartsByLuck() {
        Queue<Part> queue = new LinkedList<>();
        for (int i = 0; i < RandomUtils.getRandomInt(4); i++) {
            if (!parts.isEmpty()) {
                queue.add(parts.remove());
            }
        }
        return queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                addRandomDayPackParts();
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
