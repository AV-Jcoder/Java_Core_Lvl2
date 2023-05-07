package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Professor extends Thread {

    private String name;
    private Map<Part, Integer> groupedParts;
    private Slave slave;
    private int robotCounts;

    public Professor(String name, Slave slave) {
        this.name = name;
        groupedParts = new HashMap<>();
        this.slave = slave;
    }

    public void unloadSlave() {
        Queue<Part> queue = slave.unload();
        for (Part part : queue) {
            groupedParts.put(part, groupedParts.getOrDefault(part, 0) + 1);
        }
    }

    public void printWinner(Professor other) {
        Professor winner = null;
        Integer value1 = RobotUtils.generateRobots(this.groupedParts);
        Integer value2 = RobotUtils.generateRobots(other.groupedParts);
        if (value1 > value2) {
            winner = this;
            winner.robotCounts = value1;
        } else {
            winner = other;
            winner.robotCounts = value2;
        }
        System.out.println("Winner is " + winner.name + ". With " + winner.robotCounts + " robots. Details: " + winner.groupedParts.toString());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", groupedParts=" + groupedParts +
                '}';
    }

    @Override
    public void run() {
        try {
            int dayCount = 0;
            while (dayCount < 100) {
                slave.findPartOnDump();
                this.unloadSlave();
                dayCount++;
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
