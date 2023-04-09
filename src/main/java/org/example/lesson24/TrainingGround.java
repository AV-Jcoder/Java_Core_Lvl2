package org.example.lesson24;

public class TrainingGround {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Dobrinja");
        Hero mage = new Mage("Gendalf");
        Hero archer = new Archer("Robin Hood");
        Hero coolWarrior = new Warrior("Artur");
        attackEnemy(hero1, mage, archer, coolWarrior);
    }

    private static void attackEnemy(Hero... heroes) {
        for (Hero hero : heroes) {
            System.out.println("~~~~~~~~~");
            hero.attackEnemy();
        }
    }
}
