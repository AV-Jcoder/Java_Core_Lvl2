package org.example.part_7_Collections.lesson44_z_practice.task2.carImpl;

import org.example.part_7_Collections.lesson44_z_practice.task2.Car;

public class Taxi extends Car {

    private int gasRate;

    public Taxi(String brand, String model, int year, int gasRate) {
        super(brand, model, year);
        this.gasRate = gasRate;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result += 31 * result + gasRate;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o.getClass() != this.getClass()) return false;
        Taxi t = (Taxi) o;
        return this.gasRate == t.gasRate;
    }

    @Override
    public String toString() {
        return "Taxi{" + super.toString() +
                "gasRate=" + gasRate +
                '}';
    }
}
