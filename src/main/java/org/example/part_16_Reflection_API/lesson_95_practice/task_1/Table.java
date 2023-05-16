package org.example.part_16_Reflection_API.lesson_95_practice.task_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация.
 * Принимает название
 * схемы и таблицы в базе данных.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    String schema() default "public";
    String table();
}
