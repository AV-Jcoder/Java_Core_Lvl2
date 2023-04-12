package org.example.part_4_Strings.lesson13;

/**
 * Посчитать количество всех точек,
 * запятых и восклицательных знаков в строке
 */
public class Task4 {

    public static void main(String[] args) {
        String line = ".,qwe!q.q,q,.!!qwe!asd";
        printDotCommaAndScreamer(line);
    }

    private static void printDotCommaAndScreamer(String line) {
        int dotCount = 0;
        int commaCount = 0;
        int screamerCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '.') {
                dotCount++;
            } else if (line.charAt(i) == ',') {
                commaCount++;
            } else if (line.charAt(i) == '!') {
                screamerCount++;
            }
        }
        System.out.printf("Dot count = %d \nComma count = %d \nScreamer count = %d\n",dotCount,
                commaCount,screamerCount);
    }
}
