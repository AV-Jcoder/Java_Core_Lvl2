package org.example.part_13_Multi_Threading.lesson_75_dead_lock;

public class Account {

    private static int idGenerator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.money = money;
        this.id = idGenerator++;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
