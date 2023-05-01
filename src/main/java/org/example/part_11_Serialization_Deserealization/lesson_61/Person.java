package org.example.part_11_Serialization_Deserealization.lesson_61;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final int anyDigit = 1;
    private String firstname;
    private transient Integer age;

    public Person(String firstname, Integer age) {
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                '}';
    }
}
