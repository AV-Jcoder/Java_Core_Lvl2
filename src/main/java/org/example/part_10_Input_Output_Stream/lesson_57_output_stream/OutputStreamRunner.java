package org.example.part_10_Input_Output_Stream.lesson_57_output_stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputStreamRunner {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buff = "Hello".getBytes();
        out.write(buff);

        FileOutputStream outF;
        ObjectOutputStream outObj;
        PipedOutputStream outPip;
        FilterOutputStream filterOut;
        BufferedOutputStream outBuff;
        DataOutputStream outD;
        PrintStream outPrint;

        File file = Path.of("resources", "log.txt").toFile();
        try (BufferedOutputStream outFile = new BufferedOutputStream (new FileOutputStream(file, true))) {
            String value = "Create new user: error 34321";
            outFile.write(value.getBytes());
            outFile.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
