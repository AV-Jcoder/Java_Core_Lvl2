package org.example.lesson7;

public class Computer {

    private Ram ram;
    private Ssd ssd;

    Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue());
        System.out.println("Computer: ssd " + ssd.getValue());
    }
}
