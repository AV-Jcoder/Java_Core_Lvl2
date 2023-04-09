package org.example.lesson24;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
        this.setAttackRate(5);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        System.out.println(getName() + " attack enemy with bowl.");
    }
}
