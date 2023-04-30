package org.example.part_10_Input_Output_Stream.lesson_60_practice_lvl2.task_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача 1
 * Задан файл с текстом.
 * Определить частоту повторяемости всех букв в тексте, игнорируя регистр.
 * Вывести результат в файл в виде:
 * а - 15
 * б - 7
 * ....
 * я - 11
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException {
        Path srcPath = Path.of("resources", "text.txt");
        String text = Files.readString(srcPath);
        Map<Character, Integer> map = groupCharactersByFrequency(text);
        printCharacters(map);

        Path destPath = Path.of("resources", "grouped.txt");
        writeGroupedCharacters(map, destPath);
    }

    private static Map<Character, Integer> groupCharactersByFrequency(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character ch = Character.toLowerCase(text.charAt(i));
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    private static void printCharacters(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void writeGroupedCharacters(Map<Character, Integer> map, Path destPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destPath.toFile()))) {
            if (Files.notExists(destPath)) {
                Files.createFile(destPath);
            }
            StringBuilder line = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                line.append(entry.getKey()).append(" : ").append(entry.getValue());
                line.append(System.lineSeparator());
            }
            writer.write(line.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
