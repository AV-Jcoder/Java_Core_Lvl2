package org.example.lesson14hard;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {

    public static void main(String[] args) {
        String line = "abc Cpddd Dio OsfWw";
        String newLine = lineFormat(line);
        System.out.println(newLine);
    }

    private static String lineFormat(String line) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                continue;
            }
            sb.append(Character.toUpperCase(line.charAt(i)));
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length()-1; i++) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                continue;
            }
            sb2.append(sb.charAt(i));
        }
        return sb2.toString().toUpperCase();
    }
}
