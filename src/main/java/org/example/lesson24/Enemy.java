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

    public void getDamage(int damage) {
        if (health <= damage - armor) {
            health = 0;
        } else {
            health -= damage - armor;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
