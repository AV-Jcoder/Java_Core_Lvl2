package org.example.lesson9;

import org.example.lesson7.Computer;

public class StaticRunner {

    public static final String GREETING_STRING = "Hello World!";

    public static void main(String[] args) {
        new Computer();
        new Computer();
        new Computer();
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        System.out.println(Computer.getCounter());

        Class<? extends Computer> class1 = computer1.getClass();
        Class<? extends Computer> class2 = computer2.getClass();
        System.out.println(class1 == class2 );
    }
}
