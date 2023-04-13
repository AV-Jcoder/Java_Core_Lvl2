package org.example.part_7_Collections.lesson40homework.task1;

import java.util.ArrayList;
import java.util.List;

import static org.example.part_7_Collections.lesson40homework.task1.ChatUtil.getChats;

/**
 * Задание 1
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 *
 * Задача:
 *
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 *
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 *      а если это количество совпадает, то по названию в алфавитном порядке.
 *
 * - Также предоставить сортировку чатов по названию по умолчанию.
 *
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет
 * список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 *
 * Задача:
 *
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 *
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class Main {

    public static void main(String[] args) {

        List<Chat> chats = new ArrayList<>(getChats());
        System.out.println(chats);

        chats.sort(null);
        System.out.println(chats);

        ChatUtil.removeInactiveChats(chats);
        System.out.println(chats);
    }
}
