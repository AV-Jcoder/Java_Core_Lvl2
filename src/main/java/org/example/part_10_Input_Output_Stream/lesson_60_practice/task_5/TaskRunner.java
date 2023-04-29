package org.example.part_10_Input_Output_Stream.lesson_60_practice.task_5;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

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
        Stream<String> lines = Files.lines(srcPath);
        StringBuilder targetText = lines
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(n -> n.append(System.lineSeparator()))
                .reduce(StringBuilder::append)
                .get();
        if (Files.notExists(destPath)) {
            Files.createFile(destPath);
        }
        Files.write(destPath, targetText.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }
}
