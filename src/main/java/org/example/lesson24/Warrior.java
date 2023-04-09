package org.example.lesson24;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " attack enemy with sword.");
    }
}
