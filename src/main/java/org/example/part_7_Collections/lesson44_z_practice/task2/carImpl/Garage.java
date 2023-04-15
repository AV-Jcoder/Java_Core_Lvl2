package org.example.part_7_Collections.lesson44_z_practice.task2.carImpl;

import org.example.part_7_Collections.lesson44_z_practice.task2.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> map = new HashMap<>();

    public Garage() {}

    public void park(Car car) {
        int count = map.getOrDefault(car, 0);
        map.put(car, ++count);
    }

    public void departure(Car car) {
        int count = map.getOrDefault(car, 0);
        int newCount = count == 0 ? 0 : --count;
        map.put(car, newCount);
    }

    public int getCarCountByBrand(String brand) {
        int count = 0;
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (entry.getKey().getBrand().equals(brand)) {
                count += entry.getValue();
            }
        }
        return count;
    }

    public int getCarCountByModel(String model) {
        int count = 0;
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (entry.getKey().getModel().equals(model)) {
                count += entry.getValue();
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "map=" + map +
                '}';
    }
}
