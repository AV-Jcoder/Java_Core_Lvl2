package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.LinkedList;
import java.util.Queue;

public class Slave {

    private Queue<Part> grubbedParts;
    private Dump dump;

    public Slave(Dump dump) {
        grubbedParts = new LinkedList<>();
        this.dump = dump;
    }

    public Queue<Part> unload() {
        Queue<Part> returnedParts = grubbedParts;
        grubbedParts = null;
        return returnedParts;
    }

    public void findPartOnDump() {
        synchronized (dump) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Slave " + this.hashCode() + " go to Dump.");
            grubbedParts = dump.findPartsByLuck();
            System.out.println("Slave find: ");
            grubbedParts.stream().forEach(System.out::println);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

}
