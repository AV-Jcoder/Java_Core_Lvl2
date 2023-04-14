package org.example.part_7_Collections.lesson44_tasks.task3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Написать метод isUnique(), который принимает Map<String, String> и
 * возвращает:
 *  - true, если каждому ключу соответствует свое уникальное значение.
 *  Пример, когда метод вернёт true:
 *  {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 *
 *  - false, если у двух разных ключей совпадает значение.
 *  {Kendrik=Perkins, Stuart=Regers, Jessica=Miller, Bruce=Reges}
 *
 */
public class TaskRunner {

    public static void main(String[] args) {
        Map<String, String> map1 = Map.of("Marty", "Stepp", "Stuart", "Reges",
                "Jessica", "Miller", "Amanda", "Camp", "Hal", "Perkins");
        boolean result = isUnique(map1);
        System.out.println("Map1 is unique: " + result);

        Map<String, String> map2 = Map.of("Marty", "Stepp", "Stuart", "Reges",
                "Jessica", "Miller", "Amanda", "Camp", "Hal", "Perkins", "Bruse", "Reges");
        result = isUnique(map2);
        System.out.println("Map2 is unique: " + result);

    }

    public static boolean isUnique(Map<String, String> map) {
        boolean result = true;
        Set<String> set = new HashSet<>();
        for (String value : map.values()) {
            if (set.contains(value)) {
                return false;
            } else {
                set.add(value);
            }
        }
        return result;
    }
}
