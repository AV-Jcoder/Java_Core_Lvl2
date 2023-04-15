package org.example.part_7_Collections.lesson44_z_practice.task2.carImpl;

import org.example.part_7_Collections.lesson44_z_practice.task2.Car;

public class Bus extends Car {

    private int seats;

    public Bus(String brand, String model, int year, int seats) {
        super(brand, model, year);
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seats == bus.seats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + seats;
        return result;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                "seats=" + seats +
                '}';
    }
}
