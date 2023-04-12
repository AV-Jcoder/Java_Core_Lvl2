package org.example.part_5_OOPrinciple.lesson20;

import org.example.part_5_OOPrinciple.lesson22.Printable;

public abstract class Computer implements Printable {

    private Ssd ssd;
    private Ram ram;

    public Computer() {
    }

    public Computer(final Ram ram, final Ssd ssd) {
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

    @Override
    public void print() {
        System.out.println("Ram:" + ram.getValue() + ", Ssd:" + ssd.getValue());
    }

    public abstract void load();
}
