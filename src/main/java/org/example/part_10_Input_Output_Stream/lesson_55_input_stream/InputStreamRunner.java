package org.example.part_10_Input_Output_Stream.lesson_55_input_stream;

import java.io.*;
import java.nio.file.Path;

public class InputStreamRunner {

    public static void main(String[] args) {
//        File file = new File(String.join(File.separator, "resources", "test.txt"));
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream is = new FileInputStream(file)) {
            byte[] buff = new byte[8];
            int countBytes = 0;
            while((countBytes = is.read(buff)) > 0) {
                String text = new String(buff, 0, countBytes);
                System.out.print(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO exception");
            e.printStackTrace();
        }
    }
}
