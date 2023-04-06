package org.example.lesson2;

public class Computer {

    private int ssd = 500;
    private long ram = 1024;

    public Computer() {
        System.out.println("Я был создан");
    }

    Computer(int ssd) {
        this.ssd = ssd;
    }

    protected Computer(int ssd, long ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    Computer(long ram, int ssd) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean param) {
        System.out.println("Я загрузился");
        if (param) {
            System.out.println("Ready to work!");
        }
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
