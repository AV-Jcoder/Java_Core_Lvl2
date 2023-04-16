package org.example.part_7_Collections.lesson44_z_hard;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Cinema<Integer, Month, Film, Genre> implements Cinematic<Integer, Month, Film, Genre> {

    Map<Integer, List<Film>> map = new TreeMap<>();

    @Override
    public void add(Film film) {
        int year;

    }

    @Override
    public List getFilmsByYear(Integer year) {
        return null;
    }

    @Override
    public List getFilmsByYearAndMonth(Integer year, Month month) {
        return null;
    }

    @Override
    public List getFilmByGenre(Genre genre) {
        return null;
    }

    @Override
    public List getTopTen() {
        return null;
    }
}
