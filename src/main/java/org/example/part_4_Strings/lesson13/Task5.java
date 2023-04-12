package org.example.part_4_Strings.lesson13;

import java.util.Arrays;

/**
 * Написать функцию, разбивающую строку на равные части по n символов и сохраняющую
 * отдельные части в массив. Вывести массив на дисплей.
 */
public class Task5 {

    public static void main(String[] args) {
        String line = "A roza upala na lapu azora.";
        String[] stringArray = getNPartsOfString(line);
        System.out.println(Arrays.toString(stringArray));
    }

    private static String[] getNPartsOfString(String line) {
        int divider = 2; // изначально делим на 2 части
        int len = line.length();
        while(len % divider != 0) { // если на 2 не делится увеличиваем делитель на 1
            divider++;
        }
        if (divider == len) { // если делитель равен самому числу,
            divider = 1;      // то разбиваем строку по 1 символу.
        }
        int partition = len / divider; // считаем количество частей для разбиения.
        String[] array = new String[partition];
        int index = 0;
        for (int i = 0; i < array.length; i++) { // извлекаем подстроку и кладём в массив
            array[i] = line.substring(index, index + divider-1);
            index += divider;
        }
        return array;
    }
}
