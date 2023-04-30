package org.example.part_10_Input_Output_Stream.lesson_60_practice_lvl2.task_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.nio.file.StandardOpenOption.*;

/**
 * Задача 2
 * Создать программно и заполнить файл случайными целыми числами.
 * После чего отсортировать содержимое файла по возрастанию (т.е. перезаписать файл с новым порядком чисел)
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException, InterruptedException {
        Path destPath = Path.of("resources", "random.txt");
        writeNumbersToFile(destPath, getRandomListNumbers(20,100));
        TimeUnit.SECONDS.sleep(2);
        writeNumbersToFile(destPath, getSortedListFromFile(destPath));
    }

    private static List<String> getSortedListFromFile(Path path) throws IOException {
        return Files.lines(path)
                .map(n -> Integer.parseInt(n))
                .sorted()
                .map(n -> n.toString())
                .collect(Collectors.toList());
    }

    private static void writeNumbersToFile(Path destPath, List<String> list) throws IOException {
        Files.write(destPath, list, CREATE, TRUNCATE_EXISTING);
    }

    private static List<String> getRandomListNumbers(int listSize, int limitValue) {
        return IntStream.iterate(0, n -> n + 1)
                .limit(listSize)
                .map(n -> (int) (Math.random() * limitValue))
                .mapToObj(n -> String.valueOf(n))
                .collect(Collectors.toList());
    }
}
