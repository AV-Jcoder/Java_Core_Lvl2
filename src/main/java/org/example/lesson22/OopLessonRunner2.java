package org.example.lesson22;

import org.example.lesson20.*;

public class OopLessonRunner2 {

    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ram(8000), new Ssd(512000), 2);
        Printable mobile = new Mobile(new Ram(2000), new Ssd(128000));
        print(laptop, mobile);
        printWithRandom(laptop, mobile);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            System.out.println("~~~~~~~~~");
            object.print();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            System.out.println("*********");
            System.out.println("Static random:" + Printable.genRand());
            object.printWithRandom();
        }
    }
}
