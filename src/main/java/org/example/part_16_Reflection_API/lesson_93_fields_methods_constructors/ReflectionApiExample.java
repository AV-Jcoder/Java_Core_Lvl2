package org.example.part_16_Reflection_API.lesson_93_fields_methods_constructors;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionApiExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        User ivan = new User(25L, "Ivan");

        System.out.println("---------------------------");
        System.out.println("1. Получение класса.");
        System.out.println("---------------------------");

        // Получение класса User
        // есть 3 способа получить класс. Рассмотрен только 2-ой.
        // ? extends User так как переменная ivan может хранить потомков класса User.
        Class<? extends User> userClass = ivan.getClass();
        System.out.println(userClass.getName());
        System.out.println(userClass.getCanonicalName()); // для вложенных классов
        System.out.println(userClass.getSimpleName());
        System.out.println(Test1.class.getName());          // $Test1
        System.out.println(Test1.class.getCanonicalName()); // .Test1

        System.out.println("---------------------------");
        System.out.println("2. Получение конструкторов.");
        System.out.println("---------------------------");

        // только публичные конструкторы
        Constructor<?>[] constructors = userClass.getConstructors();
        System.out.println("Public constructors is : " + Arrays.toString(constructors));

        // получение приватных и публичных конструкторов
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        System.out.println("Private and Public constructors is : " + Arrays.toString(declaredConstructors));

        // получение конкретного публичного конструктора
        Constructor<? extends User> constructor1 = userClass.getConstructor(Long.class, String.class);
        System.out.println("Concrete public constructor is : " + constructor1);

        // получение конкретного приватного конструктора
        Constructor<? extends User> constructor2 = userClass.getDeclaredConstructor(Long.class);
        System.out.println("Concrete private constructor is : " + constructor2);

        System.out.println("---------------------------");
        System.out.println("3. Создание экземпляров.");
        System.out.println("---------------------------");

        // создание с помощью публичного конструктора
        User user1 = constructor1.newInstance(25L, "Prototype");
        System.out.println("Creating user with public constructor: " + user1);

        // создание с помощью приватного конструктора
        // предварительно установив разрешение
        constructor2.setAccessible(true);
        User user2 = constructor2.newInstance(26L);
        System.out.println("Creating user with PRIVATE constructor: " + user2);

        System.out.println("---------------------------");
        System.out.println("4. Получение полей.");
        System.out.println("---------------------------");

        // получение названий полей класса User
        Field[] declaredFields1 = userClass.getDeclaredFields();
        System.out.println("User declared fields : " + Arrays.toString(declaredFields1));

        // получение названий полей класса Person
        Field[] declaredFields2 = userClass.getSuperclass().getDeclaredFields();
        System.out.println("Person declared fields : " + Arrays.toString(declaredFields2));

        System.out.println("---------------------------------------------------");
        System.out.println("5. Получение значений полей конкретного экземпляра.");
        System.out.println("---------------------------------------------------");

        for (Field declaredField : declaredFields1) {
            // если поле приватное то нужно получить разрешение
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object value = declaredField.get(user1);
            System.out.println(name + " : " + value);
            int modifiers = declaredField.getModifiers();
            System.out.println(name + " is private ? : " + Modifier.isPrivate(modifiers));
        }

        for (Field declaredField : declaredFields2) {
            // если поле приватное то нужно получить разрешение
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object value = declaredField.get(user1);
            System.out.println(name + " : " + value);
            int modifiers = declaredField.getModifiers();
            System.out.println(name + " is private ? : " + Modifier.isPrivate(modifiers));
        }

        System.out.println("---------------------------------------------------");
        System.out.println("6. Получение методов класса.");
        System.out.println("---------------------------------------------------");

        Method[] declaredMethods = userClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("Declared method : " + declaredMethod.getName());
        }

        System.out.println("---------------------------------------------------");
        System.out.println("7. Вызов методов экземпляра.");
        System.out.println("---------------------------------------------------");

        Method getName = userClass.getDeclaredMethod("getName");
        System.out.println("Invoke method user1.getName: " + getName.invoke(user1));

        Method setName = userClass.getDeclaredMethod("setName", String.class);
        System.out.println("Invoker method user1.setName: " + setName.invoke(user1, "Vasilij"));
        System.out.println("Invoke method user1.getName: " + getName.invoke(user1));


    }

    private class Test1 {}

    private enum Test2 {
        ONE, TWO
    }

    private static class Test3 {}
}
