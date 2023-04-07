package org.example.lesson14;

public class Task6 {

    public static void main(String[] args) {
        int n = 100_000;
        concatsNTimesStringBuilder(n);
        concatsNTimesString(n);

    }

    private static void concatsNTimesStringBuilder(int n) {
        long startTime =System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < n; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder. Execution time ms: " + (endTime - startTime));
    }

    private static void concatsNTimesString(int n) {
        long startTime =System.currentTimeMillis();
        String value = "";
        for (int i = 0; i < n; i++) {
            value += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String. Execution time ms: " + (endTime - startTime));
    }
}
