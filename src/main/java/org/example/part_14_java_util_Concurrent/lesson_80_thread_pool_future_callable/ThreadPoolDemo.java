package org.example.part_14_java_util_Concurrent.lesson_80_thread_pool_future_callable;

import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(5);
        Executors.newCachedThreadPool();

        Executors.newScheduledThreadPool(10);
        Executors.newWorkStealingPool();
    }
}
