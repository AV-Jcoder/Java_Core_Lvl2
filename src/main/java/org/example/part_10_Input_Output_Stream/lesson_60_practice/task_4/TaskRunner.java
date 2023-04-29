package org.example.part_10_Input_Output_Stream.lesson_60_practice.task_4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException {
        Path srcPath = Path.of("resources", "PublicProgram.java");
        Path destPath = Path.of("resources", "PrivateProgram.java");
        parsePublicToPrivate(srcPath, destPath);
    }

    private static void parsePublicToPrivate(Path srcPath, Path destPath) throws IOException {
        String text = Files.readString(srcPath);
        String replaced = text.replace("public ", "private ");
        if (!Files.exists(destPath)) {
            Files.createFile(destPath);
        }
        Files.write(destPath,replaced.getBytes(StandardCharsets.UTF_8));
    }
}
