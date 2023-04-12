package org.example.part_5_OOPrinciple.lesson24;

import java.util.List;

public class TrainingGround {

    public static void main(String[] args) {
        Hero mage = new Mage("Gendalf");
        Hero archer = new Archer("Robin Hood");
        Hero coolWarrior = new Warrior("Artur");
        Enemy enemy = new Enemy("Zomboy",100);
        attackEnemy(List.of(mage, archer, coolWarrior), enemy);
        Archer.Wolf wolf = new Archer("Vasja"). new Wolf("Drogi");
    }

    private static void attackEnemy(List<Hero> heroes, Enemy enemy) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                System.out.println("~~~~~~~~~");
                hero.attackEnemy(enemy);
                System.out.println(enemy.getName() + " health:" + enemy.getHealth());
            }
        }
    }
}
