package org.example.part_14_java_util_Concurrent.lesson_86_practice.task_1;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * part 1.
 * - Написать программу, бесконечно считывающую
 * пользовательские числа из консоли.
 *
 * - Эти числа представляют собой количество секунд.
 *
 * - При каждом вводе числа, должна создаваться задача,
 * которая засыпает на введённое число секунд и затем
 * выводит "Я спал N секунд".
 *
 * - Однако нужно сделать так, чтобы все задачи выполнялись в
 * одном и том же потоке в порядке ввода.
 *
 * Т.е. в программе есть 2 потока: главный и поток для
 * выполнения всех задач по очереди.
 *
 * - При вводе отрицательного числа программа должна завершать свою работу.
 *
 * part 2.
 * - Второе решение - несколько потоков в пуле. Посчитать кол-во
 * обработанных задач каждым потоком.
 */
public class TaskRunner {

    public static void main(String[] args) {
        part1();
    }

    private static void part1() {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        while(true) {
            int userInputSeconds = scanner.nextInt();
            if (userInputSeconds < 0) {
                break;
            }
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                Integer value = threadLocal.get();
                threadLocal.set(value == null ? 1 : ++value);
                System.out.println(value);
                TimeUnit.SECONDS.sleep(userInputSeconds);
                System.out.printf("Поток '%s' спал %d секунд\n", threadName, userInputSeconds);
                System.out.printf("Поток %s выполнил %s задач.\n", threadName, threadLocal.get());
                return Void.TYPE;
            });

        }

        System.out.printf("Итого: поток %s выполнил %d задач.\n", Thread.currentThread().getName(), threadLocal.get());

        try {
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Task implements Runnable {

    private int seconds;

    public Task(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(seconds);
            System.out.printf("Я спал %d секунд\n", seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}