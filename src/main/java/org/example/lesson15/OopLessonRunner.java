package org.example.lesson15;

public class OopLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(256000);
        Computer computer = new Computer(ssd, ram);
        computer.load();


    }
}
