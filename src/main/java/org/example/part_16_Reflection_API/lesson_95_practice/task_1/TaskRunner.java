package org.example.part_16_Reflection_API.lesson_95_practice.task_1;

import static org.example.part_16_Reflection_API.lesson_95_practice.task_1.DbUtils.getInsertCommand;

/**
 * 1.
 * ----------------------------------------------------------------
 * Создать класс Car с полями String brand и String model.
 * -------------------------
 * Создать аннотации:
 * - @Table (принимает название схемы и таблицы
 * в базе данных)
 * -------------------------
 * - @Column (принимает название колонки в таблице
 * базы данных).
 * -----------------------------------------------------------------
 * Пометить класс аннотацией @Table и поля аннотацией @Column.
 * -----------------------------------------------------------------
 * Написать программу, принимающую объект класс Car
 * c проинициализированными полями и составляющую запрос
 * "INSERT" в виде строки на основании
 * данных объекта.
 *
 *     Пример: дан объект Car car = new Car("Toyota", "Corolla");
 * Программа, принимающая этот объект, должна вывести в консоль строку:
 * "INSERT INTO garage.car (model, brand) VALUES ('Toyota', 'Corolla');"
 *
 * 2.
 * Для получения данных программа должна
 * использовать только get-методы (нельзя использовать
 * значения приватных полей).
 */
public class TaskRunner {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        String insertCommand = getInsertCommand(car);
        System.out.println(insertCommand);
    }
}
