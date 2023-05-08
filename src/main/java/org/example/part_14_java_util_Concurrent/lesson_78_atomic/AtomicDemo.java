package org.example.part_14_java_util_Concurrent.lesson_78_atomic;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Методы атомиков используют объект Unsafe.
 * методы объекта Unsafe используют CAS неблокирующую
 * технологию.
 *
 * Например в AtomicInteger метод incrementAndGet()
 * вызывает у Unsafe метод getAndAddInt()
 * в теле которого в цикле do-while происходит попытка
 * изменить значение.
 */
public class AtomicDemo {

    public static void main(String[] args) {
        int value = 5;
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);

//        Unsafe unsafe = Unsafe.getUnsafe();

        atomicInteger.addAndGet(20);
        System.out.println(atomicInteger);
    }
}
