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
            int maxDigitCountInLine = 0;
            Scanner scanner = new Scanner(line);
            while (scanner.hasNext()) {
                String word = scanner.next();
                int maxDigitCountInWord = getMaxCharSequence(word);
                maxDigitCountInLine = Math.max(maxDigitCountInLine, maxDigitCountInWord);
            }
            System.out.println(maxDigitCountInLine + " : " + line);
        }
    }

    private static int getMaxCharSequence(String word) {
        int maxCharSequence = 0;
        int sequence = 0;
        // 88888yyy777yy33
        char char0 = word.charAt(0);
        if (char0 >= '0' && char0 <= '9') {
            sequence = 1;
            maxCharSequence = 1;
        }
        for (int i = 1; i < word.length(); i++) {
            if ((word.charAt(i) >= '0') && (word.charAt(i) <= '9')) {
                if ((word.charAt(i-1) >= '0') && (word.charAt(i-1) <= '9')) {
                    sequence++;
                } else {
                    sequence = 1;
                }
                maxCharSequence = Math.max(maxCharSequence, sequence);
            }
        }
        return maxCharSequence;
    }
}
