package org.example.part_16_Reflection_API.lesson_94_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionApiAnnotationExample {

    public static void main(String[] args) {
        User user = new User(12L, "Andrey", 25);
        Class<User> userClass = User.class;
        try {
            Field userAge = userClass.getDeclaredField("age");
            userAge.setAccessible(true);
            Annotation declaredAnnotation = userAge.getDeclaredAnnotation(MinAge.class);
            System.out.println("Annotation = " + declaredAnnotation);

            int age = userAge.getDeclaredAnnotation(MinAge.class).age(); // получить доступ к свойству аннотации.
            System.out.println("MinAge age() = " + age);

            System.out.println("user age = " + userAge.get(user));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
