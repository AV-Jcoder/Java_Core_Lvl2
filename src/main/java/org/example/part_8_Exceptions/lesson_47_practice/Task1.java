package org.example.part_8_Exceptions.lesson_47_practice;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println("Main start");
        String nullLine = null;
        try {
            nullLine.charAt(0);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Main end");
    }
}
