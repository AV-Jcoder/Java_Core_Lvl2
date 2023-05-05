package org.example.part_13_Multi_Threading.lesson_72_thread_safe_object;

import java.util.ArrayList;
import java.util.List;

/**
 * Для создания потокобезопасных обьектов можно:
 *
 * 1. Объявить все методы с модификатором synchronized.
 * 2. Вызывать методы в блоке synchronized.
 * 3. Сделать все поля обекта immutable, те объявить их final.
 * 4. В методах-геттерах возвращать копию значения.
 */
public class Example {

    private final List<Integer> list;

    public Example(List<Integer> list) {
        this.list = List.copyOf(list); // immutable list
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}
