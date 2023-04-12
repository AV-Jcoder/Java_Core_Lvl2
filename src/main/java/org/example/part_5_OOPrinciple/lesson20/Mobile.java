package org.example.part_5_OOPrinciple.lesson20;

public class Mobile extends Computer {

    public Mobile() {
    }

    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Mobile loaded");
    }
}
