package org.example.part_13_Multi_Threading.lesson_76_practice.task_1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Задан LinkedList, представляющий собой хранилище целых чисел.
 * Поток ProducerThread c какой-то периодичностью бесконечно
 * добавляет в этот список случайные числа,
 * однако максимальное количество, которое он может
 * добавить, равно 10.
 *
 * Поток ConsumerThread бесконечно считывает числа с какой-то случайной
 * задержкой (от 0 до 10 мс).
 *
 * Сделать так, чтобы метод produce добавлял числа только тогда,
 * когда не превышен лимит, а метод consume забирал их только
 * тогда, когда в списке что-нибудь есть.
 * При этом методы должны корректно работать в многопоточной
 * среде.
 *
 * Создать и запустить два различных потока, один из которых
 * вызывает produce, а другой - consume.
 * Продемонстрировать корректность работы хранилища с помощью
 * вывода сообщений в консоль о добавлении, получении и текущем
 * размере хранилища на этапах добавления и получения.
 */
public class TaskRunner {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();

        Thread prodThread = new Thread(new ProducerThread(queue));
        Thread consThread = new Thread(new ConsumerThread(queue));
        prodThread.start();
        consThread.start();

        prodThread.join();
        consThread.join();

        System.out.println("Main finish.");

    }
}
