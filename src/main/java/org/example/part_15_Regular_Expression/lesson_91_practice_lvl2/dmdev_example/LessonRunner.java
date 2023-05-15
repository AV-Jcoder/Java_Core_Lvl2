package org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example;

import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.parser.LogFileParser;
import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.report.StatisticReportGenerator;
import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.report.TimeReportGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class LessonRunner {

    public static void main(String[] args) throws IOException {
        var logFilePath = Path.of("resources", "homework.log");
        var logFileParser = new LogFileParser();
        var logFileDays = logFileParser.parse(logFilePath);

        var timeReportGenerator = new TimeReportGenerator();
        var timeReport = timeReportGenerator.generate(logFileDays);
        Files.writeString(Path.of("resources", "time-report.txt"), timeReport, CREATE, TRUNCATE_EXISTING);

        var statisticReportGenerator = new StatisticReportGenerator();
        var statisticReport = statisticReportGenerator.generate(logFileDays);
        Files.writeString(Path.of("resources", "statistic-report.txt"), statisticReport, CREATE, TRUNCATE_EXISTING);
    }
}