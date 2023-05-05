package org.example.part_13_Multi_Threading.lesson_70_collection_synch;

import java.util.List;

public class ListCounterThread extends Thread {

    private final List<Integer> list;

    public ListCounterThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
//            synchronized(list) {
                list.add(i);
//            }
        }
    }
}
