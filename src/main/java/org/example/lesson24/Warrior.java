package org.example.lesson24;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
        setAttackRate(16);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        int damage = super.attackEnemy(enemy);
        System.out.println(getName() + " attack with sword " + enemy.getName());
        return damage;
    }
}
