package org.example.part_10_Input_Output_Stream.lesson_59_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");

        System.out.println("\nБуферезированное чтение из Files");
        BufferedReader reader = Files.newBufferedReader(Path.of("resources", "test.txt"));
        String buff;
        while ((buff = reader.readLine()) != null) {
            System.out.println(buff);
        }

        System.out.println("\nЧтение строки с помощью Files");
        System.out.println(Files.readString(path));

        System.out.println("\nЗапись с помощью Files");
        Files.write(path, List.of("Hello", "Goodbye"));

        System.out.println("\nЛист строк из Files");
        List<String> list = Files.readAllLines(path);
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nПолучение стрима из Files.");
        try (Stream<String> stringStream = Files.lines(path)) {
            stringStream.forEach(System.out::println);
        }
    }
}
