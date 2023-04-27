package org.example.part_10_Input_Output_Stream.lesson_58_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "hello.txt").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Hello Java");
        }
    }
}
