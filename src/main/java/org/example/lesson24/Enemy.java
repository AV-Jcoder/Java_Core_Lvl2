package org.example.lesson24;

public class Enemy {

    private int health;
    private int armor;

    public Enemy(int health) {
        this.health = health;
        this.armor = 1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void getDamage(int damage) {
        health -= damage - armor;
    }
}
