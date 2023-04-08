package org.example.lesson16;

import org.example.lesson15.Computer;
import org.example.lesson15.Ram;
import org.example.lesson15.Ssd;

public class Laptop extends Computer {

    private int weight;

    Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd,ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        super.load();
        System.out.println("Laptop is ready!");
    }
}
