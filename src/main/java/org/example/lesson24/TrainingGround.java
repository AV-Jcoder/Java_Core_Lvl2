package org.example.lesson24;

import java.util.List;

public class TrainingGround {

    public static void main(String[] args) {
        Hero mage = new Mage("Gendalf");
        Hero archer = new Archer("Robin Hood");
        Hero coolWarrior = new Warrior("Artur");
        Enemy enemy = new Enemy(100);
        attackEnemy(List.of(mage, archer, coolWarrior), enemy);
    }

    private static void attackEnemy(List<Hero> heroes, Enemy enemy) {
        for (Hero hero : heroes) {
            System.out.println("~~~~~~~~~");
            hero.attackEnemy(enemy);
            System.out.println("Enemy health:" + enemy.getHealth());
        }
    }
}
