package org.example.lesson16;

import org.example.lesson15.Computer;
import org.example.lesson15.Ram;
import org.example.lesson15.Ssd;

public class Runner {

    public static void main(String[] args) {
        Ram ram = new Ram(2048);
        Ssd ssd = new Ssd(128000);
        Computer computer = new Computer(ssd, ram);
        computer.load();

        Laptop laptop = new Laptop(new Ssd(256_000), new Ram( 16_000), 2);
        laptop.load();

        Class<? extends Laptop> aClass = laptop.getClass();
        System.out.println(aClass.getName());
        System.out.println(laptop);

        System.out.println("Create computer");
        Computer computer1 = new Computer();
        System.out.println("Create laptop");
        Laptop laptop1 = new Laptop();

    }
}
