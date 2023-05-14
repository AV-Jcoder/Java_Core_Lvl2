package org.example.part_15_Regular_Expression.lesson_91_practice.task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например
 * <p id="p1">
 * и замену их на простые теги абзацев
 * <p>
 */
public class TaskRunner {

    public static void main(String[] args) {
        String text = "<p id=\"p1\"> text </p> <p> <pomidor> </p> <p id=\"\"> text  </p>";
        String text1 = "<p id=\"major\">text</p>";

        String regex = "(<p.+?>)(.+?</p>)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String result = text.replaceAll(regex, "<p>empty$2");
        System.out.println(result);
    }
}
