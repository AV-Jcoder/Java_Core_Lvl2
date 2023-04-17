package org.example.part_8_Exceptions.lesson_47_practice;

import java.io.IOException;

/**
 *  *
 *  * 5. Бросить одно из существующих в JDK исключений, отловить его и
 *  * выбросить своё собственное, указав в качестве причины отловленное.
 *  *
 */
public class Task5 {

    public static void main(String[] args) {
        System.out.println("Start main");
        try {
            throwException();
        } catch (IOException e) {
            RuntimeException e2 = new MyRuntimeException("My runtime exception");
            e2.initCause(e);
            throw e2;
        }
    }

    public static void throwException() throws IOException {
        throw new IOException();
    }
}
