package org.example.part_1_intro.lesson7;

public class Computer {

    private Ram ram;
    private Ssd ssd;
    private static int counter  = 0;

    public Computer() {
        counter++;
    }

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue());
        System.out.println("Computer: ssd " + ssd.getValue());
    }

    public static int getCounter() {
        return counter;
    }
}
