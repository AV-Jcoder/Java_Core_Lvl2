package org.example.lesson24;

public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name) {
        super(name);
        this.setAttackRate(6);
        wolf = new Wolf("Baikal");
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        int damage = super.attackEnemy(enemy);
        System.out.printf("%s attack with bowl %s. Damage %d \n", this.getName(), enemy.getName(), damage);
        damage += wolf.attackEnemy(enemy);
        return damage;

    }

    public class Wolf {

        private String name;

        public Wolf(String name) {
            this.name = name;
        }

        public int attackEnemy(Enemy enemy) {
            int damage = enemy.getDamage(Archer.this.getAttackRate() / 2);
            System.out.printf("Dog %s hit %s. Damage %d.\n", Wolf.this.name, enemy.getName(), damage);
            return damage;
        }
    }
}
