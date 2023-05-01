package org.example.part_11_Serialization_Deserealization.lesson_61;

import java.io.*;
import java.nio.file.Path;

public class SerExam {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "student.out");
        writeObjectOnDisc(path);
        readObjectFormDisc(path);
    }

    private static void readObjectFormDisc(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object obj = in.readObject();
            System.out.println(obj);
        }
    }

    private static void writeObjectOnDisc(Path path) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person vasiliy = new Person("Vasiliy", 38);
            out.writeObject(vasiliy);
        }
    }
}
