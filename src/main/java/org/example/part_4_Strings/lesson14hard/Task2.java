package org.example.part_4_Strings.lesson14hard;

import java.util.Arrays;

/**
 *
 ﻿Задание 2
 Дана строка с текстом, в котором есть цифры от 0 до 9.

 Написать 2 метода:

 - возвращающий массив цифр из переданной строки
 - возвращающий сумму цифр из переданного целочисленного массива

 Посчитать сумму всех чисел из строки

 Например:
 “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 *
 *
 *
 */
public class Task2 {

    public static void main(String[] args) {
        String line = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] numbers = getIntArray(line);
        int sum = getSum(numbers);
        System.out.println("numbers : " + Arrays.toString(numbers));
        System.out.println("sum = " + sum);

    }

    private static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static int[] getIntArray(String line) {
        int countNumbers = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                countNumbers++;
            }
        }
        int[] numbers = new int[countNumbers];
        int index = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                numbers[index++] = Character.getNumericValue(line.charAt(i));
            }
        }
        return numbers;
    }
}
