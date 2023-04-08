package org.example.lesson16;

import org.example.lesson15.Computer;
import org.example.lesson15.Ram;
import org.example.lesson15.Ssd;

public class Laptop extends Computer {

    Laptop(Ssd ssd, Ram ram) {
        super(ssd,ram);
    }

    @Override
    public void load() {
        super.load();
        System.out.println("Laptop is ready!");
    }
}
