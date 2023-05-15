package org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.dto;

import java.util.ArrayList;
import java.util.List;

public class LogFileDay {

    private final List<LogFileRow> rows = new ArrayList<>();

    public void add(LogFileRow row) {
        rows.add(row);
    }

    public List<LogFileRow> getRows() {
        return rows;
    }
}