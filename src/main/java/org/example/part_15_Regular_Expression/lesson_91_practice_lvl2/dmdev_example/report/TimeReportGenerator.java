package org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.report;

import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.dto.LogFileDay;
import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.util.ActivityUtils;
import org.example.part_15_Regular_Expression.lesson_91_practice_lvl2.dmdev_example.util.StringUtils;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class TimeReportGenerator implements ReportGenerator {

    @Override
    public String generate(List<LogFileDay> logFileDays) {
        return logFileDays.stream()
                .map(this::convertDay)
                .collect(joining(System.lineSeparator()));
    }

    private String convertDay(LogFileDay logFileDay) {
        var result = new StringBuilder();
        ActivityUtils.consumeActivityDuration(logFileDay, (currentActivity, nextActivity) ->
                result.append(currentActivity.getTime().toString())
                        .append(StringUtils.DASH)
                        .append(nextActivity.getTime().toString())
                        .append(StringUtils.SPACE)
                        .append(currentActivity.getActivityName())
                        .append(System.lineSeparator()));

        return result.toString();
    }
}