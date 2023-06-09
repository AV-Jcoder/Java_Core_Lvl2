// DTO (Data Transfer Object) - объект, который используется для инкапсуляции данных.
// Обычно используют для передачи данных из одного класса в другой, вместо того,
// чтобы передавать все поля DTO по отдельности (удобно оперировать одним объектом а не множеством,
// а также добавлять новые или удалять старые поля)
package org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.dto;

import java.time.LocalTime;

public class LogFileRow {

    private final LocalTime time;
    private final String activityName;

    public LogFileRow(LocalTime time, String activityName) {
        this.time = time;
        this.activityName = activityName;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getActivityName() {
        return activityName;
    }
}