package org.example.part_13_Multi_Threading.lesson_70_collection_synch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCounterDemo {

    public static void main(String[] args) throws InterruptedException {
        // Синхронизированная обертка для коллекции.
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        ListCounterThread thread1 = new ListCounterThread(list);
        ListCounterThread thread2 = new ListCounterThread(list);
        ListCounterThread thread3 = new ListCounterThread(list);
        ListCounterThread thread4 = new ListCounterThread(list);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(list.size());
    }
}
