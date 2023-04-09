package org.example.lesson24;

public class Enemy implements Mortal{

    private String name;
    private int health;
    private int armor;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        this.armor = 1;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamage(int attackRate) {
        int damage = attackRate - armor;
        if (health <= damage) {
            int healthCopy = health;
            health = 0;
            return healthCopy;
        } else {
            health -= damage;
            return damage;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
