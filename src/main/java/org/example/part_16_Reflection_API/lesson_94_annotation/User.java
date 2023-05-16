package org.example.part_16_Reflection_API.lesson_94_annotation;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {

    public static int idGenerator = 1;

    private String name;
    @MinAge(age = 21)
    private int age;

    private User(Long id) {
        super(id);
        this.name = "Anonymous";
    }

    public User(Long id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() + ", " +
                "name='" + name + '\'' +
                '}';
    }
}
