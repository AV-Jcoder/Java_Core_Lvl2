package org.example.part_7_Collections.lesson40homework.task2;

import java.util.List;

/**
 *  *
 *  * Задание 2
 *  * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет
 *  * список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 *  *
 *  * Задача:
 *  *
 *  * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 *  *
 *  * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 *  *
 */
public class TaskRunner {

    public static void main(String[] args) {
        List<Chat> chats = ChatUtils.getChats();

        for (Chat chat : chats) {
            System.out.println(chat.getName()+ ":");
            for (User user : chat.getUsers()) {
                System.out.println(user);
            }
        }

        List<User> users18Plus = ChatUtils.getListUsers18Plus(chats);
        System.out.println("Users 18 +:");
        for (User plus : users18Plus) {
            System.out.println(plus);
        }

    }
}
