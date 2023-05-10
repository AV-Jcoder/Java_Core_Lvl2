package org.example.part_14_java_util_Concurrent.lesson_84_cyclic_barrier;

import java.util.Arrays;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(RocketDetail.values().length,
                () -> System.out.println("Rocket Start"));

        ExecutorService threadPool = Executors.newCachedThreadPool();


        Arrays.stream(RocketDetail.values())
                .map(n -> new RocketDetailCreator(barrier, n))
                .forEach(threadPool::submit);

        threadPool.shutdown();
        threadPool.awaitTermination(10, TimeUnit.SECONDS);
    }
}
