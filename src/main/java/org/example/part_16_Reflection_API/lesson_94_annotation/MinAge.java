package org.example.part_16_Reflection_API.lesson_94_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация MinAge указывает минимально
 * возможный возраст для пользователя.
 */
@Target({   // @Target - указывает, где можно использовать аннотацию MinAge.
            ElementType.TYPE, // TYPE - для класса
            ElementType.FIELD // FIELD - для поля
})
@Retention(RetentionPolicy.RUNTIME) // Правило сохранения аннотации. RUNTIME - Аннотации сохранены виртуальной машиной во время выполнения.
public @interface MinAge {

    int age(); // Свойство Аннотации под названиен age. В него нельзя ничего передавать,
               // но свойство может возвращать только какое-либо значение.
    // если по-умолчанию возвращаемое значение не определено, то нам нужно указать значение
    // этого свойства при обьявлении аннотации в классе, например:

    // public class User {

    //     @MinAge(age = 21)
    //     private int a;

    // int age() default 18; // можно установить возвращаемое значение по умлочанию


    // int value(); // Свойство под названием value, имя зарезервировано.

    // Если по-умолчанию значение не возвращается, то указать значение
    // можно при объявлении Аннотации, например:

    // public class User {

    //     @MinAge(21) // в этом отличие зарезервированного имени свойства, указывать его имя не нужно.
    //     private int a;
}
