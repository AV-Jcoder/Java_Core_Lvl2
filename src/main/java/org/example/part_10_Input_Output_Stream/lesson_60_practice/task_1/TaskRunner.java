package org.example.part_10_Input_Output_Stream.lesson_60_practice.task_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException {
        Path textPath = Path.of("resources", "text.txt");
        String text = Files.readString(textPath);
        displayVowel(text);
    }

    private static void displayVowel(String text) {
        String vowel = "аёеиоуыэюя";
        try (Scanner scanner = new Scanner(text)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstChar = word.charAt(0);
                if (vowel.indexOf(firstChar) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}
