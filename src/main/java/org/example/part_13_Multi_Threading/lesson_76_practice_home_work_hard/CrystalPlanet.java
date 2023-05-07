package org.example.part_13_Multi_Threading.lesson_76_practice_home_work_hard;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Кристаллы растут на другой планете с рандомной
 * скоростью от 2 до 5 рандомных кристаллов в сутки
 * (может быть 1 красный и 2 белых, а может и вовсе
 * все 4 кристалла красного цвета).
 */
public class CrystalPlanet extends Thread {

    private final LinkedList<Crystal> crystals;

    public CrystalPlanet() {
        crystals = new LinkedList<>();
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
        int randomIntBetween = CrystalPlanetUtil.getRandomIntBetween(2, 5);
        List<Crystal> collected = new LinkedList<>();
        for (int i = 0; i < randomIntBetween; i++) {
            if (!crystals.isEmpty()) {
                collected.add(crystals.remove());
            }
        }
        return collected;
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
