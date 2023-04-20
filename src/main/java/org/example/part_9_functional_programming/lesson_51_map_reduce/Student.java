package org.example.part_9_functional_programming.lesson_51_map_reduce;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int age;
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student() {
        age = -1;
        name = "Dummy";
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
