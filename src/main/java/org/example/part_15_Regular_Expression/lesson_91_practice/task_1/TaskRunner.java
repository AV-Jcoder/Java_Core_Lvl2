package org.example.part_15_Regular_Expression.lesson_91_practice.task_1;

/**
 * 1. Написать программу, проверяющую, является ли введённая
 * строка адресом почтового ящика.
 * В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно
 * начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */
public class TaskRunner {

    public static void main(String[] args) {
        String text = "a123ivani.vanov@gmail.com";
        String regex = "[a-zA-Z]\\w{2}[\\w\\.]*@\\w{3,}\\.(com|org)";
        System.out.println(text.matches(regex));
    }
}
