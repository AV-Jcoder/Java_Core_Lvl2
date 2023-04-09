package org.example.lesson24;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
        setAttackRate(12);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        System.out.println(getName() + " attack enemy with sword.");
    }
}
