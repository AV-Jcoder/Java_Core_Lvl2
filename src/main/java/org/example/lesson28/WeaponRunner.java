package org.example.lesson28;

import org.example.lesson28.weapon.Bowl;
import org.example.lesson28.weapon.IronSword;
import org.example.lesson28.weapon.WoodenBowl;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bowl> arch = new Archer<>("Robin");
        arch.setWeapon(new WoodenBowl());

        Warrior<IronSword> war = new Warrior<>("Conan");
        war.setWeapon(new IronSword());


    }

}
