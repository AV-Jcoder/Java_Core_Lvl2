package org.example.lesson24;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " attack enemy with bowl.");
    }
}
