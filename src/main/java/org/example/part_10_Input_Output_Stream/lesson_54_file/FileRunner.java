package org.example.part_10_Input_Output_Stream.lesson_54_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *              output stream
 * application ----------------> file (to db or disc)
 *
 *               input stream
 * application <---------------- file (from db or disc)
 *
 *
 */
public class FileRunner {

    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        System.out.println("File is created? : " + file.createNewFile());
        System.out.println("File is exists? : " + file.exists());
        System.out.println("File is file? : " + file.isFile());
        System.out.println("File is directory? : " + file.isDirectory());
        System.out.println("File name : " + file.getName());
        System.out.println("File parent : " + file.getParent());
        System.out.println("File len: " + file.length());
        System.out.println("File can read: " + file.canRead());
        System.out.println("File can write: " + file.canWrite());
        System.out.println("File can execute: " + file.canExecute());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        File dir = new File("resources/test/dir/");
        dir.mkdirs();

        File dir2 = new File("resources/img/");
        dir2.mkdirs();

        File dir3 = new File(dir2, "png/");
        dir3.mkdir();

        File dir4 = new File("resources/");
        System.out.println(Arrays.toString(dir4.list()));



    }
}
