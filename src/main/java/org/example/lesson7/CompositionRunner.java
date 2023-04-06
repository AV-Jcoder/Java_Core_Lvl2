package org.example.lesson7;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(8000);

        Ssd ssd = new Ssd(512000);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}
