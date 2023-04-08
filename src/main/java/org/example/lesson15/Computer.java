package org.example.lesson15;

public class Computer {
    private Ssd ssd;
    private Ram ram;

    {
        System.out.println("Init block computer");
    }

    static {
        System.out.println("Static block computer");
    }

    public Computer() {
        super();
        System.out.println("Constructor Computer()");
    }

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("Я загрузился.");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
