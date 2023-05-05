package org.example.part_13_Multi_Threading.lesson_71_volatile;

/**
 *
 * [RAM   flag = false]
 *
 *                              read           still false !
 * 1 processor cached ----> flag = false ----> flag = false
 *
 *
 *                              read              change
 * 2 processor cached ----> flag = false ----> flag = true
 *
 *
 *
 *
 */
public class VolatileDemo {

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("still false");
            }
        });
        thread1.start();

        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("flag is set");
        });
        thread2.start();

    }
}
