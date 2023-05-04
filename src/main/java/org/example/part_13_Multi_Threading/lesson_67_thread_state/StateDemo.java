package org.example.part_13_Multi_Threading.lesson_67_thread_state;

public class StateDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "MyRunnable");
        System.out.println(thread.getName() + ": " + thread.getState());

        thread.start();
        System.out.println(thread.getName() + ": " + thread.getState());

        Thread.sleep(500);
        System.out.println(thread.getName() + ": " + thread.getState());

        Thread.sleep(500);
        System.out.println(thread.getName() + ": " + thread.getState());

        thread.join();
        System.out.println(thread.getName() + ": " + thread.getState());
    }
}
