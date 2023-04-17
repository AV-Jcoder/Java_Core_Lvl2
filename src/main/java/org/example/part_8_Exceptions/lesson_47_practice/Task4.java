package org.example.part_8_Exceptions.lesson_47_practice;

/**
 *  * 4. Повторить предыдущее упражнение, но наследуя свой класс от класса
 *  * RuntimeException.
 *  * Добавить в конструктор своего класса возможность указания
 *  * сообщения.
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println("Start main");
        throw new MyRuntimeException("Privet. Eto moe iskluchenie");

    }
}

class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {}

    public MyRuntimeException(String message) {
        super(message);
    }
}
