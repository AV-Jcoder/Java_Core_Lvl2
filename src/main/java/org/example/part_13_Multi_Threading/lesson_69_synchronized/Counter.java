package org.example.part_13_Multi_Threading.lesson_69_synchronized;

public class Counter {

    private int count;
    private static String staticField;

    public static void initStaticField() {
        synchronized (Counter.class) {
            if (staticField == null) {
                staticField = "Value of static field";
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count = count + 1;
    }

    public void decrement() {
        count = count - 1;
    }
}
