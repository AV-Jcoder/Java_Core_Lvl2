package org.example.lesson14homework;

/**
 * ﻿Задача 2
 * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999.
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Предусмотреть случай, когда меньший символ идёт перед большим:
 * Например CM == 900.
 *
 * Соответствие:
 *
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */

/**
 * Римские цифры нужно считать с конца.
 *
 * 1 - I        10 - X      100 - C
 * 2 - II       20 - XX     200 - CC
 * 3 - III      30 - XXX    300 - CCC
 * 4 - IV       40 - XL     400 - CD
 * 5 - V        50 - L      500 - D
 * 6 - VI       60 - LX     600 - DC
 * 7 - VII      70 - LXX    700 - DCC
 * 8 - VIII     80 - LXXX   800 - DCCC
 * 9 - IX       90 - XC     900 - CM
 *10 - X       100 - C     1000 - M
 *
 *
 */


public class Task2 {

    public static void main(String[] args) {
        String roman = "CDXLIV";
        int arabic = getArabicNumber(roman);
        System.out.println(roman + " - " + arabic);
    }

    private static int getArabicNumber(String roman) {
        int len = roman.length();
        int right = number(roman.charAt(len-1));
        int current;
        int result = right;
        for (int i = len-2; i >= 0; i--) {
            current = number(roman.charAt(i));
            result += current < right ? -current : current;
            right = current;
        }
        return result;
    }

    private static int number(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}