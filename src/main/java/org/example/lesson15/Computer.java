package org.example.lesson15;

public class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("Я загрузился.");
    }


}
