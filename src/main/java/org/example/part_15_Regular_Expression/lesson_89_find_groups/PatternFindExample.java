package org.example.part_15_Regular_Expression.lesson_89_find_groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "sddfg +7 (911) 911-11-11 sdf 123asf sdd 34534 fg" +
                " +7 (221) 221-33-21 s 213 fasf " +
                "+7 (141) 555-88-21 gh 123 jr " +
                "+7 (911) 999-77-+7" +
                "+7 (911) 999-77-(911)" +
                "+7 (913) 999-77-21";

        String regex = "(\\+\\d\\s)?\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}";

        // Ищет совпадение вначале строки, т.к. указан символ ^
        String regex2 = "^(\\+\\d\\s)?\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}";

        // Поиск совпадения на конце строки, т.к указан символ $
        String regex3 = "(\\+\\d)? ?(\\(\\d{3}\\))? \\d{3}-\\d{2}-\\d{2}$";

        // Ссылаемся на вторую группу с помощью \\2
        String regex4 = "(\\+\\d)? ?(\\(\\d{3}\\))? \\d{3}-\\d{2}-\\2";

        // Даём название группе
        String regex5 = "(?<country>\\+\\d)? ?(\\(\\d{3}\\))? \\d{3}-\\d{2}-\\2";

        // Исключить группу из списка с помощью ?: -> (?:\(\d{3}\)) . Осталась только одна группа.
        String regex6 = "(?<country>\\+\\d)? ?(?:\\(\\d{3}\\))? \\d{3}-\\d{2}-\\1";

        Pattern compile = Pattern.compile(regex6);
        Matcher matcher = compile.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println("Substring: " + matcher.group()); // получить подстроку

            System.out.println("Group 0 : " + matcher.group(0));
            System.out.println("Group 1 : " + matcher.group(1)); // получить первую группу подстроки. (\+\d\s)?
//            System.out.println("Group 2 : " + matcher.group(2)); // получить вторую группу. (\(\d{3}\))
            System.out.println("Country group: " + matcher.group("country"));
        }
    }
}
