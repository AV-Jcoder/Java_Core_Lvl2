package org.example.part_5_OOPrinciple.lesson16;

import org.example.part_5_OOPrinciple.lesson15.Computer;
import org.example.part_5_OOPrinciple.lesson15.Ram;
import org.example.part_5_OOPrinciple.lesson15.Ssd;

public class Laptop extends Computer {

    private int weight;

    {
        System.out.println("Init block for laptop");
    }

    static {
        System.out.println("Static init block laptop");
    }

    public Laptop() {
        super();
        System.out.println("Constructor Laptop()");
    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd,ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        super.load();
        System.out.println("Laptop is ready!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
