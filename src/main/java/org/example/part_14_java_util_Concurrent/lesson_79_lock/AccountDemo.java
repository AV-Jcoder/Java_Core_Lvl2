package org.example.part_14_java_util_Concurrent.lesson_79_lock;

/**
 * Взаимная блокировка потоков.
 */
public class AccountDemo {

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(20_000);
        Account account2 = new Account(20_000);

        AccountThread thread1 = new AccountThread(account1, account2);
        AccountThread thread2 = new AccountThread(account2, account1);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(account1);
        System.out.println(account2);
    }
}
