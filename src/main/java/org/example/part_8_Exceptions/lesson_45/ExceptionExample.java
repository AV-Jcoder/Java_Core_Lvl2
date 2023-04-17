package org.example.part_8_Exceptions.lesson_45;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Start main");
        try {
            unsafe(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End main");
    }

    public static void unsafe(int value) throws Exception, FileNotFoundException, IOException, IllegalArgumentException {
        System.out.println("Start unsafe");
        if (value > 0) {
            throw new Exception("Wrong Number!");
        }
        System.out.println("End unsafe");
    }
}
