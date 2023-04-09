package org.example.lesson24;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " attack enemy with fireBaLL.");
    }
}
