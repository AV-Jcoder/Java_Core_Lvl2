package org.example.part_10_Input_Output_Stream.lesson_60_practice.task_5;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException {
        Path srcPath = Path.of("resources", "PublicProgram.java");
        Path destPath = Path.of("resources", "ReversCharsProgram.java");
        writeFileWithReverseChars(srcPath, destPath);

    }

    private static void writeFileWithReverseChars(Path srcPath, Path destPath) throws IOException {
        String srcText = Files.readString(srcPath);
        StringBuilder targetText = new StringBuilder();
        Scanner scanner = new Scanner(srcText);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (int i = line.length()-1; i >= 0; i--) {
                targetText.append(line.charAt(i));
            }
            targetText.append(System.lineSeparator());
        }
        if (Files.notExists(destPath)) {
            Files.createFile(destPath);
        }
        Files.write(destPath, targetText.toString().getBytes(StandardCharsets.UTF_8));
    }
}
