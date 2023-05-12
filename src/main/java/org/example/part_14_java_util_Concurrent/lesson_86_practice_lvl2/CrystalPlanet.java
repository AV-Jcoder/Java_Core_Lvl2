package org.example.part_14_java_util_Concurrent.lesson_86_practice_lvl2;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Кристаллы растут на другой планете с рандомной
 * скоростью от 2 до 5 рандомных кристаллов в сутки
 * (может быть 1 красный и 2 белых, а может и вовсе
 * все 4 кристалла красного цвета).
 */
public class CrystalPlanet extends Thread {

    private final LinkedList<Crystal> crystals;
    private final Semaphore semaphore;

    public CrystalPlanet() {
        crystals = new LinkedList<>();
        semaphore = new Semaphore(1);
    }

    private void growCrystals() {
        crystals.addAll(CrystalPlanetUtil.growRandomCrystals());
    }

    /**
     * Каждая ракета может погрузить на борт
     * от 2 до 5 рандомных кристаллов.
     * @return
     */
    public List<Crystal> collectCrystal() {
        try {
            semaphore.acquire();

            int randomIntBetween = CrystalPlanetUtil.getRandomIntBetween(2, 5);
            List<Crystal> collected = new LinkedList<>();
            for (int i = 0; i < randomIntBetween; i++) {
                if (!crystals.isEmpty()) {
                    collected.add(crystals.remove());
                }
            }
            semaphore.release();
            return collected;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                growCrystals();
                TimeUnit.MILLISECONDS.sleep(200);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
