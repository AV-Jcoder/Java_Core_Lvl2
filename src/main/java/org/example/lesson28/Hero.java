package org.example.lesson28;

import org.example.lesson28.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private int attackRate;
    private T weapon;

    public Hero(String name) {
        this.name = name;
        attackRate = 10;
    }

    public String getName() {
        return name;
    }

    public int getAttackRate() {
        return attackRate;
    }

    public void setAttackRate(int attackRate) {
        this.attackRate = attackRate;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public int attackEnemy(Enemy enemy) {
        return enemy.getDamage(attackRate);
    }
}
