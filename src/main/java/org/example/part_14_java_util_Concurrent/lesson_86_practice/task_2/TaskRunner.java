package org.example.part_14_java_util_Concurrent.lesson_86_practice.task_2;

import java.sql.Time;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 2.Задан массив случайных целых чисел (от 1 до 300)
 * случайной длины (до 1 млн элементов).
 * Найти максимальный элемент в массиве двумя способами:
 *
 * - в одном потоке
 *
 * - используя 10 потоков.
 * Сравнить затраченное в обоих случаях время.
 */
public class TaskRunner {

    public static void main(String[] args) throws InterruptedException {
        int size = 200_000_000;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (500_000 - 10) + 10);
        }

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        int min2 = trackTime(() -> {
            try {
                return findMinInMultiThread(array, threadPool);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        int min1 = trackTime(() -> findMinInSingleThread(array));


        System.out.println("Min is : " + min1);
        System.out.println("Min is : " + min2);

        threadPool.shutdown();
        threadPool.awaitTermination(10, TimeUnit.SECONDS);

    }

    private static int trackTime(Supplier<Integer> task) {
        long startTime = 0;
        long endTime = 0;
        startTime = System.currentTimeMillis();
        int min1 = task.get();
        endTime = System.currentTimeMillis();
        System.out.println("Time is : " + (endTime - startTime) + " ms");
        return min1;
    }

    public static int findMinInSingleThread(int[] array) {
        return IntStream.of(array).min().orElse(Integer.MIN_VALUE);
    }

    private static int findMinInMultiThread(int[] array, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() -> IntStream.of(array)
                .parallel()
                .min()
                .orElse(Integer.MIN_VALUE)).get();
    }
}
