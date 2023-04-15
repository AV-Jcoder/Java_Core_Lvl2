package org.example.part_7_Collections.lesson44_z_practice.task2.carImpl;

import org.example.part_7_Collections.lesson44_z_practice.task2.Car;

public class Limyzin extends Car {

    private String prestigeClass;

    public Limyzin(String brand, String model, int year, String prestigeClass) {
        super(brand, model, year);
        this.prestigeClass = prestigeClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Limyzin limyzin = (Limyzin) o;
        return prestigeClass.equals(limyzin.prestigeClass);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + prestigeClass.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Limyzin{" + super.toString() +
                "prestigeClass='" + prestigeClass + '\'' +
                '}';
    }
}
