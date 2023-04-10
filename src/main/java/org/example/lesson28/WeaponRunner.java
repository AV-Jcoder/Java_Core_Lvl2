package org.example.lesson28;

import org.example.lesson28.weapon.*;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bowl> arch = new Archer<>("Robin");
        arch.setWeapon(new WoodenBowl());

        Warrior<IronSword> war = new Warrior<>("Conan");
        war.setWeapon(new IronSword());

        printWeaponDamage(war);

    }

    public static <T extends Weapon> void printWeaponDamage(Hero<? super IronSword> hero) {
        hero.getWeapon();
        hero.setWeapon(new AbsoluteIronSword());
        System.out.println(hero.getWeapon().getDamage());
    }

}
