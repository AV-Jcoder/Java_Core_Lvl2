package org.example.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();
        System.out.println("");

        Computer computer2 = new Computer(512);
        computer2.printState();
        System.out.println("");

        Computer computer3 = new Computer(256, 2048L);
        computer3.printState();
        computer3.load();
        computer3.load(true);
    }
}
