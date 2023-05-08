package org.example.part_14_java_util_Concurrent.lesson_81_thread_pool_future_callable;

import java.sql.SQLOutput;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * В целои ThreadPools позволяют нам экономить время на
 * созднии потоков, просто переиспользуя их.
 */
public class ThreadPoolDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello World!");
        future1.thenAccept(n -> System.out.println(n));

        // Отложенный запуск задачи
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        threadPool.schedule(()-> System.out.println("Hello Scheduled World"), 1000, TimeUnit.MILLISECONDS);

        // Отложенный запуск задачи с переодичностью
        threadPool.scheduleAtFixedRate(()-> System.out.println("start task with fixed rate"), 3000, 1000, TimeUnit.MILLISECONDS);

//      вызов shutdown прекратит выполнение задачи сразу же, т.к. ее нет в очереди задач.
//        threadPool.shutdown();
//        threadPool.awaitTermination(10L, TimeUnit.SECONDS);
    }

    private static void exampleOne() throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> submit = threadPool
                .submit(
                        // Runnable -> считает до 10 потом возвращает -1
                        () -> IntStream
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
        // блокируемся на определенное время
        Integer integer = submit.get(6, TimeUnit.SECONDS); // блокирующий вызов для main потока.
        System.out.println(integer);

        threadPool.shutdown();
//        threadPool.shutdownNow();
        threadPool.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Main finished");
    }
}
