package org.example.part_13_Multi_Threading.lesson_65_thread;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " start:");
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i + ". Hello form concurrent thread: " + this.getName());
        }
    }
}
