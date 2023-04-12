package org.example.part_6_Generics.lesson28;

import org.example.part_6_Generics.lesson28.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name) {
        super(name);
        setAttackRate(11);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        int damage = super.attackEnemy(enemy);
        System.out.println(getName() + " attack with fireBaLL " + enemy.getName());
        return damage;
    }
}
