package org.example.part_7_Collections.lesson44_z_practice.task2.carImpl;

import org.example.part_7_Collections.lesson44_z_practice.task2.Car;

public class Truck extends Car {

    private int maxLoadKilo;

    public Truck(String brand, String model, int year, int maxLoadKilo) {
        super(brand, model, year);
        this.maxLoadKilo = maxLoadKilo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxLoadKilo == truck.maxLoadKilo;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxLoadKilo;
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "maxLoadKilo=" + maxLoadKilo +
                '}';
    }
}
