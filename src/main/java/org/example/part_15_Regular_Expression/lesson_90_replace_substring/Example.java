package org.example.part_15_Regular_Expression.lesson_90_replace_substring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Замена подстроки на любую другую подстроку.
 *
 * Пример с заменой цифр у номера телефона на символы #
 *
 */
public class Example {

    public static void main(String[] args) {
        String text = "sdd +7 (911) 911-11-11 ssf" +
                " +7 (221) 221-33-21 sdfd " +
                " +7 (141) 555-88-21 werx " +
                " +7 (913) 999-77-21 sdf ";

        // Исключить группу из списка с помощью ?: -> (?:\(\d{3}\))
        String regex = "(?<country>\\+\\d)? ?(?:\\(\\d{3}\\))? \\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Все локальные переменные потокобезопасны
        // StringBuffer buffer = new StringBuffer();
        // Поэтому проедпочтительнее использовать StringBuilder
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(builder, "+#(###)-###-##-##");
        }
        matcher.appendTail(builder);
        System.out.println(builder);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Выражение с пятью группами.
        String regex2 = "(?<country>\\+\\d)? ?(\\(\\d{3}\\))? ?(\\d{3})-(\\d{2})-(\\d{2})";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text);
        StringBuilder builder2 = new StringBuilder();
        while(matcher2.find()) {
            String gr1 = matcher2.group(1);
            String gr2 = matcher2.group(2);
            String gr3 = matcher2.group(3);
            String gr4 = matcher2.group(4);
            String gr5 = matcher2.group(5);
//          matcher2.appendReplacement(builder2, gr1+"~~"+gr2+"~~"+gr3+"~~"+gr4+"~~"+gr5);
            // С помощью символа $ можно ссылаться на группы, поэтому выражения выше и ниже равнозначны:
            matcher2.appendReplacement(builder2, "$1~~$2~~$3~~$4~~$5");
        }
        System.out.println(builder2);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Аналогия с помощью методов класса String
        String result = text.replaceAll(regex2, "### PHONE=$1$2$3 ###");
        System.out.println(result);

    }
}
