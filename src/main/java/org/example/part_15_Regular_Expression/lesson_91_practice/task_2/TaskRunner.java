package org.example.part_15_Regular_Expression.lesson_91_practice.task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Написать программу, выполняющую поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class TaskRunner {

    public static void main(String[] args) {
        String text = "0x1jlo212 0x11 0xabc";
        String regex = "0[xX][0-9a-fA-F]+(\\W|\\z)";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

        // сверхжадный квантификатор ++
        String reg = "[XY]++[A-Z]";
        String tex = "YYXXX";
        Pattern compile1 = Pattern.compile(reg);
        Matcher matcher1 = compile1.matcher(tex);
        // false
        System.out.println(matcher1.find());


    }

    {
        // двоичная система счисления
        int[] values = new int[17];
        values[0] = 0x0;
        values[1] = 0x1;
        values[2] = 0x2;
        values[3] = 0x3;
        values[4] = 0x4;
        values[5] = 0x5;
        values[6] = 0x6;
        values[7] = 0x7;
        values[8] = 0x8;
        values[9] = 0x9;
        values[10] = 0xa;
        values[11] = 0xb;
        values[12] = 0xc;
        values[13] = 0xd;
        values[14] = 0xe;
        values[15] = 0xf;
        values[16] = 0x10;
        for (int value : values) {
            System.out.println(value);
        }
    }

    {
        // шестнадцатиричная система счисления
        int[] values = new int[17];
        values[0] =     0b0;
        values[1] =     0b1;
        values[2] =    0b10;
        values[3] =    0b11;
        values[4] =   0b100;
        values[5] =   0b101;
        values[6] =   0b110;
        values[7] =   0b111;
        values[8] =  0b1000;
        values[9] =  0b1001;
        values[10] = 0b1010;
        values[11] = 0b1011;
        values[12] = 0b1100;
        values[13] = 0b1101;
        values[14] = 0b1110;
        values[15] = 0b1111;
        values[16] = 0b10000;
        for (int value : values) {
            System.out.println(value);
        }
    }
}
