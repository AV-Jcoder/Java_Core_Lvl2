package org.example.part_4_Strings.lesson13;

/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию, и
 * отчество и возвращающую инициалы
 *  в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 *  регистре, а результирующая строка должна быть в верхнем.
 */
public class Task3 {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Petrov";
        String patronymic = "Sidorovich";
        String initials1 = getInitials(firstName, lastName, patronymic);
        System.out.println(initials1);
    }

    private static String getInitials(String firstName, String lastName, String patronymic) {
        char[] buff = new char[5];
        buff[0] = Character.toUpperCase(firstName.charAt(0));
        buff[1] = '.';
        buff[2] = Character.toUpperCase(lastName.charAt(0));
        buff[3] = '.';
        buff[4] = Character.toUpperCase(patronymic.charAt(0));
        return new String(buff);
    }
}
