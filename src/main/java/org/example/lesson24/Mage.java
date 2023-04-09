package org.example.lesson24;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
        setAttackRate(11);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        int damage = super.attackEnemy(enemy);
        System.out.println(getName() + " attack with fireBaLL " + enemy.getName());
        return damage;
    }
}
