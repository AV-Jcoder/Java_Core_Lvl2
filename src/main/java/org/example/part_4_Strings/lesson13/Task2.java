package org.example.part_4_Strings.lesson13;

/**
 * Написать функцию, принимающую 2 параметра: строку и слово  - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {

    public static void main(String[] args) {
        String line = "privet. napishi v otvet privet";
        String word1 = "privet1";

        boolean result1 = isLineStartAndEndWithOneWord(line, word1);
        System.out.println("Начало и конец строки рдинаковые: " + result1);

        boolean result2 = isLineStartAndEndWithOneWord2(line, word1);
        System.out.println("Начало и конец строки рдинаковые: " + result2);
    }

    private static boolean isLineStartAndEndWithOneWord2(String line, String word1) {
        int len1 = word1.length();
        int len2 = line.length();

        for (int i = 0; i < len1; i++) {
            if (word1.charAt(i) != line.charAt(i)) {
                return false;
            }
        }

        for (int i = len1-1; i >= 0; i--) {
            if (word1.charAt(i) != line.charAt(i+(len2-len1))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLineStartAndEndWithOneWord(String line, String word1) {
        return line.startsWith(word1) && line.endsWith(word1);
    }


}
