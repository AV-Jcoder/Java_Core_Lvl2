package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.concurrent.TimeUnit;

/**
 * Задача 1
 *
 * Двое безумных учёных устроили соревнование, кто из них соберёт больше роботов за 100 ночей.
 * Для этого каждую ночь каждый из них отправляет своего прислужника на свалку фабрики роботов за деталями.
 *
 * Чтобы собрать одного робота им нужно:
 * Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD
 *
 * В первую ночь на свалке находится 20 случайных деталей.
 * Каждую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.
 *
 * В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
 * Если на свалке деталей нет – прислужник уходит ни с чем.
 * Затем они возвращаются домой и отдают детали хозяевам.
 * Учёные пытаются собрать как можно больше роботов из деталей, которые они получили.
 *
 * Написать программу, симулирующую этот процесс.
 * Для симуляции принять, что каждая ночь наступает через 100мс.
 *
 * Фабрика и два прислужника действуют в одно и то же время.
 * После 100 ночей (около 10 секунд) определить победителя соревнования
 */
public class TaskRunner {

    public static void main(String[] args) throws InterruptedException {
        Dump dump = new Dump();

        Slave slave1 = new Slave(dump);
        Slave slave2 = new Slave(dump);

        Professor prof1 = new Professor("Crazy One", slave1);
        Professor prof2 = new Professor("Crazy Two", slave2);

        dump.start();
        prof1.start();
        prof2.start();

        dump.join();
        prof1.join();
        prof2.join();

        System.out.println();

        System.out.println(prof1);
        System.out.println(prof2);

        prof1.printWinner(prof2);

    }
}
