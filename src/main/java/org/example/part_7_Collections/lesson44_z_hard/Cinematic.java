package org.example.part_7_Collections.lesson44_z_hard;

import java.util.List;

public interface Cinematic<Year, Month, Film, Genre> {

    void add(Film film);
    List<Film> getFilmsByYear(Year year);
    List<Film> getFilmsByYearAndMonth(Year year, Month month);
    List<Film> getFilmByGenre(Genre genre);
    List<Film> getTopTen();
}
