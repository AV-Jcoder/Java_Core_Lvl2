package org.example.part_7_Collections.lesson44_z_hard;

import org.example.part_7_Collections.lesson44_z_hard.filmUtils.Genre;
import org.example.part_7_Collections.lesson44_z_hard.filmUtils.Month;

/**
 * Задание 1
 *
 * Даны 2 класса:
 *
 * - Фильм
 * с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 *
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 *
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 *
 * - добавлять в него новый фильм
 *
 * - получить все фильмы по переданному году
 *
 * - получить все фильмы по переданному году и месяцу
 *
 * - получить все фильмы по переданному жанру
 *
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 *
 * Учесть следующее:
 *
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него
 * (т.е. предусмотреть порядок значения ассоциативного массива)
 *
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 *
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class TaskRunner {

    public static void main(String[] args) {
        Film film1 = new Film(1, "Terminator", 2000, Month.APRIL, Genre.THRILLER, 9.2);
        Film film2 = new Film(2, "Terminator 2", 2002, Month.DECEMBER, Genre.THRILLER, 9.9);
        Film film3 = new Film(3, "Alien", 2000, Month.APRIL, Genre.THRILLER, 8.1);
        Film film4 = new Film(4, "Predator", 2000, Month.APRIL, Genre.THRILLER, 8.1);
        Film film5 = new Film(5, "Rembo",2003, Month.MARCH, Genre.THRILLER, 6.9);
        Film film6 = new Film(6, "Stupid and Stupider",2001, Month.MAY, Genre.COMEDY, 8.4);
        Film film7 = new Film(7, "The Mask",2002, Month.JUNE, Genre.COMEDY, 8.5);
        Film film8 = new Film(8, "Alisa",2001, Month.FEBRUARY, Genre.FANTASY, 8.5);
        Film film9 = new Film(9, "Matrix",2002, Month.AUGUST, Genre.FANTASY, 9.9);

        Cinema cinema = new Cinema();
        cinema.add(film1);
        cinema.add(film2);
        cinema.add(film3);
        cinema.add(film4);
        cinema.add(film5);
        cinema.add(film6);
        cinema.add(film7);
        cinema.add(film8);
        cinema.add(film9);

        System.out.println("Top five:");
        System.out.println(cinema.getTopFive());
        System.out.println("~~~~~~");
        System.out.println("By genre:");
        System.out.println(cinema.getFilmByGenre(Genre.THRILLER));
        System.out.println("~~~~~~");
        System.out.println("By year:");
        System.out.println(cinema.getFilmsByYear(2000));
        System.out.println("~~~~~~");
        System.out.println("By year and month:");
        System.out.println(cinema.getFilmsByYearAndMonth(2000, Month.APRIL));
        System.out.println("~~~~~~");
    }
}
