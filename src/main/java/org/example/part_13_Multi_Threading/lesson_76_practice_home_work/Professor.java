package org.example.part_13_Multi_Threading.lesson_76_practice_home_work;

import java.util.*;

public class Professor {

    private String name;
    private Map<Part, Integer> groupedParts;
    private Slave slave;

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

    private Map.Entry<Part, Integer> getLessGroupParts() {
        Map.Entry<Part, Integer> partIntegerEntry = groupedParts.entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue, (a, b) -> a < b ? a : b)).get();
        return partIntegerEntry;
    }

    public void printWinner(Professor other) {
        Professor winner = null;
        Map.Entry<Part, Integer> thisLessGroupParts = this.getLessGroupParts();
        Map.Entry<Part, Integer> otherLessGroupParts = other.getLessGroupParts();
        Integer value1 = thisLessGroupParts.getValue();
        Integer value2 = otherLessGroupParts.getValue();
        if (value1 > value2) {
            winner = this;
        } else {
            winner = other;
        }
        System.out.println("Winner is " + winner.name + ". Details: " + winner.groupedParts.toString());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", groupedParts=" + groupedParts +
                '}';
    }
}
