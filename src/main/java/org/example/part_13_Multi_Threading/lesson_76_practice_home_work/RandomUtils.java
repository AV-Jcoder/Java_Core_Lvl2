package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * Утилитный класс. Выполняет роль поставщика запчастей, т.е. фабрика.
 */
public final class RandomUtils {

    private static final Random random = new Random();
    private static final int maxPartNumber = 9;
    private static final int maxPartsPerDay = 4;

    private RandomUtils() {
    }

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static Queue<Part> getRandomStartPackParts() {
        Queue<Part> parts = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            parts.add(getRandomPart());
        }
        return parts;
    }

    public static List<Part> getRandomDayPack() {
        int count = random.nextInt(maxPartsPerDay);
        List<Part> list = new LinkedList<>();
        for (int i = 0; i < count ; i++) {
            list.add(getRandomPart());
        }
        return list;
    }

    private static Part getRandomPart() {
        return switch (random.nextInt(maxPartNumber)) {
            case 1 -> Part.BODY;
            case 2 -> Part.LEFT_HAND;
            case 3 -> Part.RIGHT_HAND;
            case 4 -> Part.LEFT_LEG;
            case 5 -> Part.RIGHT_LEG;
            case 6 -> Part.CPU;
            case 7 -> Part.RAM;
            case 8 -> Part.HDD;
            default -> Part.HEAD;
        };
    }
}
