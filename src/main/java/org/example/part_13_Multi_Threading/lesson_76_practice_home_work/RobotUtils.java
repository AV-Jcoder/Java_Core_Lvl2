package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class RobotUtils {

    public static void main(String[] args) {
        Map<Part, Integer> map = Arrays.stream(Part.values()).collect(Collectors.toMap(n -> n, n -> 1));
        for (Integer integer : map.values()) {
            integer += 1;
        }
        System.out.println(map);
        areThereAllParts(map);
    }

    private RobotUtils()  {}

    public static int generateRobots(Map<Part, Integer> map) {
        int robotsCount = 0;
        if (areThereAllParts(map)) {
            robotsCount = getLessGroupParts(map);
        }
        return robotsCount;
    }

    private static boolean areThereAllParts(Map<Part, Integer> map) {
        Part[] parts = Part.values();
        for (Part part : parts) {
            if (!map.containsKey(part)) {
                System.out.println("Недостаточно запчастей для сборки.");
                return false;
            }
        }
        return true;
    }

    private static int getLessGroupParts(Map<Part, Integer> map) {
        int min = -1;
        for (Integer value : map.values()) {
            if (min == -1 || min > value) {
                min = value;
            }
        }
        return min;
    }
}
