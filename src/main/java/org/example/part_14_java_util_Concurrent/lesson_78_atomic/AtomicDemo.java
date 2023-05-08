package org.example.part_14_java_util_Concurrent.lesson_78_atomic;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * wait-free
 * - алгоритм который завершается за конечное число операций,
 * вне зависимости от того что другие потоки данных будут делать с той же
 * структурой или областью памяти.
 *
 * lock-free
 * - более слабая гарантия. Т.е. гарантии нет, что задача завершится за конечное время.
 * Возможно поток никогда не завершит свое действие.
 * Возможно он будет работать бесконечно долго, но в целом остальные потоки,
 * которые работают с той же структурой данных будут продвигаться,
 * т.е. программа в целом будет производить полезные действия.
 * В отличии от dead-lock алгоритмов не требуует вмешательства внешнего менеджера.
 *
 * obstruction-free
 * - свободный от препятствий. самая слабая гарантия. Означает, что поток
 * может закончить свою работу только если ему никто не будет мешать,
 * т.е. только если заморозить все остальные потоки с помощью менеджера, то
 * только тогда этот поток закончит свою работу.
 *
 *
 *
 * Методы атомиков используют объект Unsafe.
 * методы объекта Unsafe используют CAS блокирующую
 * технологию на уровне процессора.
 *
 * CAS является lock-free алгоритмом, который теоретически
 * может выполняться бесконечно долго.
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
