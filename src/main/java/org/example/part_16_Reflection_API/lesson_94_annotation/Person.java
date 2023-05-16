package org.example.part_16_Reflection_API.lesson_94_annotation;

public abstract class Person {

    private Long id;

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
