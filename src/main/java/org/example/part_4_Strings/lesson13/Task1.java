package org.example.part_4_Strings.lesson13;

/**
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class Task1 {

    public static void main(String[] args) {
        String line = "123 :(, 123 :(. 123 :(.";

        String smileLine = replaceSadSmilesVer1(line);
        System.out.println(smileLine);

        String smileLine2 = replaceSadSmilesVer2(line);
        System.out.println(smileLine2);

    }

    private static String replaceSadSmilesVer1(String line) {
        return line.replaceAll("[:(]+",":)");
    }

    private static String replaceSadSmilesVer2(String line) {
        return line.replace(":(", ":)");
    }
}
