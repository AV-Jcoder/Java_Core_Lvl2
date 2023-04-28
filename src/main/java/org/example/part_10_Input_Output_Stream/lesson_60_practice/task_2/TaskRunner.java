package org.example.part_10_Input_Output_Stream.lesson_60_practice.task_2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

/**
 * 2. Задан файл с текстом, найти и вывести в консоль все слова,  для
 *         которых последняя буква одного слова совпадает с первой буквой
 *         следующего слова
 */

public class TaskRunner {

    public static void main(String[] args) throws IOException {
        Path textPath = Path.of("resources", "text.txt");
        String text = Files.readString(textPath);
        printWords(text);
    }

    private static void printWords(String text) {
        Scanner scanner = new Scanner(text.toLowerCase(Locale.ROOT));
        String current = null;
        if (scanner.hasNext()) {
            current = scanner.next();
        }
        String next;
        while (scanner.hasNext()) {
            next = scanner.next();
            int curSize = current.length();
            int nextSize = next.length();
            if (current.charAt(curSize-1) == next.charAt(0)) {
                System.out.println(current + " : " + next);
            }
            current = next;
        }
    }
}
