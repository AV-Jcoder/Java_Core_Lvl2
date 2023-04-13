package org.example.part_7_Collections.lesson40homework.task2;

import java.util.List;

public class Chat implements Comparable<Chat> {

    private String name;
    private List<User> users;

    public Chat(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "\nChat{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.name.compareTo(o.name);
    }
}
