package org.example.part_5_OOPrinciple.lesson20;

public class OopLessonRunner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(8000), new Ssd(512000), 2);
        Computer mobile = new Mobile(new Ram(2000), new Ssd(128000));
        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile});
    }

    public static void loadComputers(Computer... computers) {
        for (Computer c : computers) {
            System.out.println("~~~~~~~~~");
            c.load();
        }
    }

    public static void printInformation(Computer[] computers) {
        for (Computer comp : computers) {
            System.out.println("++++++++++");
            if (comp instanceof Laptop) {
                Laptop laptop = (Laptop) comp;
                laptop.open();
            }
            comp.print();
        }
    }
}
