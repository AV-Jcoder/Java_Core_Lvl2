package org.example.lesson14homework;

/**
 * Задача 1
 * Проверить, является ли введённая строка палиндромом,
 * т.е. читается одинаково в обоих направлениях.
 */
public class Task1 {

    public static void main(String[] args) {
        String line = "arozaupalanalapuazora";
        boolean isPalindrom = isPalindrome(line);
        System.out.println("String is palindrom: " + isPalindrom);

        isPalindrom = isPalidrome2(line);
        System.out.println("String is palindrom: " + isPalindrom);
    }

    private static boolean isPalindrome(String line) {
        int i = 0;
        int j = line.length()-1;
        while (i<j) {
            if (line.charAt(i) != line.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalidrome2(String line) {
        return new StringBuilder(line).reverse().toString().equalsIgnoreCase(line);
    }
}
