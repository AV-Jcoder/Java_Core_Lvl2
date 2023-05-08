package org.example.part_14_java_util_Concurrent.lesson_81_thread_pool_future_callable;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ThreadPoolDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> submit = threadPool
                .submit(() -> IntStream
                        .iterate(0, n -> n + 1)
                        .limit(10)
                        .forEach(n -> {System.out.println(n);
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                }),
                        -1);
        Integer integer = submit.get();
        System.out.println(integer);

//        threadPool.shutdown();
//        threadPool.shutdownNow();
        threadPool.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Main finished");

    }
}
