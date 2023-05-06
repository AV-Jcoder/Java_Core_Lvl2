package org.example.part_13_Multi_Threading.lesson_76_practice.task_1;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();
    private static final int BOUND = 10;

    private RandomUtil() {}

    public static int getRandom() {
        return RANDOM.nextInt(BOUND);
    }

    public static int getRandom(int bound) {
        return RANDOM.nextInt(bound);
    }
}
