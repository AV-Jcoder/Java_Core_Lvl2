package org.example.part_14_java_util_Concurrent.lesson_86_practice_lvl2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class CrystalPlanetUtil {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            System.out.println(getRandomCrystal());
        }
    }

    private final static int minGrow = 2;
    private final static int maxGrow = 5;

    private CrystalPlanetUtil() {}

    public static List<Crystal> growRandomCrystals() {
        List<Crystal> list = new LinkedList<>();
        int crystalCount = getRandomIntBetween(minGrow, maxGrow);
        for (int i = 0; i < crystalCount; i++) {
            list.add(getRandomCrystal());
        }
        return list;
    }

    private static Crystal getRandomCrystal() {
        int random = new Random().ints(0, 2).findFirst().getAsInt();
        return switch (random) {
            case 0 -> Crystal.RED;
            case 1 -> Crystal.WHITE;
            default -> null;
        };
    }

    public static int getRandomIntBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + max);
    }


}
