package org.example.part_16_Reflection_API.lesson_93_fields_methods_constructors;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {

    private String name;

    private User(Long id) {
        super(id);
        this.name = "Anonymous";
    }

    public User(Long id, String name) {
        super(id);
        this.name = name;
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
