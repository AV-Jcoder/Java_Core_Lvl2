package org.example.part_12_Date_and_Time_API.lesson_64_practice_lvl2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/**
 * Задача 1
 * Написать свою реализацию интерфейса TemporalAdjuster,
 * которая бы изменяла дату на ближайшее (в днях) 1 января.
 */
public class Task1Runner {

    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2018, 8, 27), LocalTime.MIDNIGHT);
//        LocalDateTime result = adjustToNearestYear(localDateTime);
//        System.out.println(result);

        //          my
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime nearestJanuary = getNearestFirstJanuary(now);

        System.out.println(nearestJanuary);

    }

    private static LocalDateTime getNearestFirstJanuary(LocalDateTime now) {
        LocalDateTime lastJanuary = now.with(TemporalAdjusters.firstDayOfYear());
        LocalDateTime nextJanuary = now.with(TemporalAdjusters.firstDayOfNextYear());

        System.out.println(lastJanuary);
        System.out.println(nextJanuary);

        Duration dur1 = Duration.between(lastJanuary, now);
        Duration dur2 = Duration.between(now, nextJanuary);

        System.out.println(dur1.toDays() + " : " + dur2.toDays());

        LocalDateTime nearestJanuary = dur1.toDays() < dur2.toDays() ? lastJanuary : nextJanuary;
        return nearestJanuary;
    }
//
//    private static LocalDateTime adjustToNearestYear(LocalDateTime localDateTime) {
//        return localDateTime.with(it -> {
//            Temporal currentYear = it.with(TemporalAdjusters.firstDayOfYear());
//            Temporal nextYear = it.with(TemporalAdjusters.firstDayOfNextYear());
//            long betweenCurrentYear = ChronoUnit.DAYS.between(currentYear, it);
//            long betweenNextYear = ChronoUnit.DAYS.between(it, nextYear);
//
//            return betweenCurrentYear < betweenNextYear ? currentYear : nextYear;
//        });
//    }


}
