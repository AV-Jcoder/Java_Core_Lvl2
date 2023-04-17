package org.example.part_8_Exceptions.lesson_46;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Start main");
        throwException();
        System.out.println("End main");

    }

    public static void throwException() throws RuntimeException {
        System.out.println("Start throwException");
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("In finally.");
        }
    }

    public static int getNumber() {
        try {
            return 2;
        } catch (Throwable e) {
            return 3;
        } finally {
            return 8;
        }
    }


}
