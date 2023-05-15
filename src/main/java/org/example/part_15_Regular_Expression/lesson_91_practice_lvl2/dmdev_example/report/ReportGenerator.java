package org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.report;

import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.dto.LogFileDay;

import java.util.List;

public interface ReportGenerator {

    String generate(List<LogFileDay> logFileDays);
}