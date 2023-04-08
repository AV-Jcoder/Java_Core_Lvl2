package org.example.lesson20;

public abstract class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer() {
    }

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
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

    public void print() {
        System.out.println("Ram:" + ram.getValue() + ", Ssd:" + ssd.getValue());
    }

    public abstract void load();
}
