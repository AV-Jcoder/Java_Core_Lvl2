package org.example.part_10_Input_Output_Stream.lesson_56;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {

    public static void main(String[] args) throws IOException {
//        File file = new File(String.join(File.separator, "resources", "test.txt"));
        File file = Path.of("resources", "test.txt").toFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String collect = reader.lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(collect);
        }
    }
}
