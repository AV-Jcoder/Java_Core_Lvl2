package org.example.part_14_java_util_Concurrent.lesson_79_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Применение интерфейса Lock для синхронизации потоков.
 */
public class Account {

    private static int idGenerator = 1;
    private int id;
    private int money;
    private Lock lock = new ReentrantLock();

    public Account(int money) {
        this.money = money;
        this.id = idGenerator++;
    }

    public Lock getLock() {
        return lock;
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
