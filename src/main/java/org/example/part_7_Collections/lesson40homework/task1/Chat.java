package org.example.part_7_Collections.lesson40homework.task1;

public class Chat implements Comparable<Chat> {

    private String name;
    private int userCount;

    public Chat(String name, int userCount) {
        this.name = name;
        this.userCount = userCount;
    }

    public String getName() {
        return name;
    }

    public int getUserCount() {
        return userCount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", userCount=" + userCount +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.name.compareTo(o.name);
    }
}
