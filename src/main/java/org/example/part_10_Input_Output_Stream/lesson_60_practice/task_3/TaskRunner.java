package org.example.part_10_Input_Output_Stream.lesson_60_practice.task_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 3. Задан файл с текстом. В каждой строке найти и вывести
 *  наибольшее число цифр, идущих подряд.
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("resources","text.txt"));
        printMaxDigitCount(text);
    }

    private static void printMaxDigitCount(String text) {
        String[] lines = text.split(System.lineSeparator());
        for (String line : lines) {
            int maxDigitCountInLine = getMaxCharSequence(line);
            System.out.println(maxDigitCountInLine + " : " + line);
        }
    }

    private static int getMaxCharSequence(String word) {
        int maxCharSequence = 0;
        int sequence = 0;
        // 88888yyy777yy33
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                sequence++;
            } else {
                maxCharSequence = Math.max(sequence, maxCharSequence);
                sequence = 0;
            }
        }
        return maxCharSequence;
    }
}
