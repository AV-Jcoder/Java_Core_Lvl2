package org.example.part_16_Reflection_API.lesson_95_practice.task_1;

import java.lang.reflect.Field;

/**
 * Программа, принимающая объект класс Car
 * c проинициализированными полями и составляющую запрос
 * "INSERT" в виде строки на основании
 * данных объекта.
 */
public final class DbUtils {

    private DbUtils() {}

    /**
     * Программа, принимающая этот объект, должна вывести в консоль строку:
     * "INSERT INTO garage.car (model, brand) VALUES ('Toyota', 'Corolla');"
     * @param car
     * @return
     */
    public static String getInsertCommand(Car car) {
        String command = null;
        try {
            // Получаем объект класса Class.
            Class<? extends Car> carClass = car.getClass();

            // Достаем нужные аннотации из класса.
            Table aTable = carClass.getAnnotation(Table.class);
            Column aBrand = carClass.getDeclaredField("brand").getDeclaredAnnotation(Column.class);
            Column aModel = carClass.getDeclaredField("model").getDeclaredAnnotation(Column.class);

            // Достаем значения аннотаций.
            String schema = aTable.schema();
            String table = aTable.table();

            String brandAttribute = aBrand.attribute();
            String modelAttribute = aModel.attribute();

            // Получаем значение полей объекта car с помощью рефлексии.
            Field brand = carClass.getDeclaredField("brand");
            brand.setAccessible(true);
            String theBrandValue = brand.get(car).toString();

            Field model = carClass.getDeclaredField("model");
            model.setAccessible(true);
            String theModelValue = model.get(car).toString();

            // Записываем в команду полученные значения.
            command = String.format("""
                    INSERT INTO %s.%s
                    (%s, %s)
                    VALUES
                    ('%s', '%s');
                    """,
                    schema, table,
                    brandAttribute, modelAttribute,
                    theBrandValue, theModelValue
                    );

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return command;
    }


}
