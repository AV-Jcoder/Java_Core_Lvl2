package org.example.part_6_Generics.lesson28;

import org.example.part_6_Generics.lesson28.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name) {
        super(name);
        setAttackRate(16);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        int damage = super.attackEnemy(enemy);
        System.out.println(getName() + " attack with sword " + enemy.getName());
        return damage;
    }
}
