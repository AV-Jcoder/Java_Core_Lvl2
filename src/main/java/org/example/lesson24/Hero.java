package org.example.lesson24;

public abstract class Hero {

    private String name;
    private int attackRate;

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

    public int attackEnemy(Enemy enemy) {
        return enemy.getDamage(attackRate);
    }
}
