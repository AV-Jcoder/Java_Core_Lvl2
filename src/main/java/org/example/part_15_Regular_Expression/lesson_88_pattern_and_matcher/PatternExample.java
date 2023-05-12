package org.example.part_15_Regular_Expression.lesson_88_pattern_and_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("\\d{3}");
        Matcher matcher1 = pattern1.matcher("123");
        System.out.println(matcher1.matches());

        String phoneNumber = "+7 (911) 911-11-11";
        String regex = "(\\+\\d\\s)?\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}";

        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern2.matcher(phoneNumber);
        System.out.println(matcher2.matches());

        System.out.println(Pattern.matches(regex, phoneNumber));

        // Метод класса String
        System.out.println(phoneNumber.matches(regex));
    }
}
