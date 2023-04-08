package org.example.lesson20;

public class Laptop extends Computer {

    private int weight;

    public Laptop() {}

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    public void open() {
        System.out.println("Open Laptop");
    }

    @Override
    public void load() {
        open();
        System.out.println("Laptop Loaded");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight:" + weight);
    }
}
