package org.example.part_7_Collections.lesson44_z_hard;

import org.example.part_7_Collections.lesson44_z_hard.filmUtils.Genre;
import org.example.part_7_Collections.lesson44_z_hard.filmUtils.Month;

import java.util.*;

public class Cinema implements Cinematic<Integer, Month, Film, Genre> {

    Map<Integer, List<Film>> map = new TreeMap<>();

    @Override
    public void add(Film film) {
        int year = film.getYear();
        map.putIfAbsent(year, new ArrayList<>());
        List<Film> list = map.get(year);
        list.add(film);
    }

    @Override
    public List<Film> getFilmsByYear(Integer year) {
        return map.get(year);
    }

    @Override
    public List<Film> getFilmsByYearAndMonth(Integer year, Month month) {
        List<Film> list = new ArrayList<>(map.get(year));
        ListIterator<Film> iter = list.listIterator();
        while (iter.hasNext()) {
            Film film = iter.next();
            if (film.getMonth() != month) {
                iter.remove();
            }
        }
        return list;
    }

    @Override
    public List getFilmByGenre(Genre genre) {
        List<Film> list = new ArrayList<>();
        for (Map.Entry<Integer, List<Film>> entry : map.entrySet()) {
            List<Film> mapList = entry.getValue();
            for (Film film : mapList) {
                if (film.getGenre() == genre) {
                    list.add(film);
                }
            }
        }
        return list;
    }

    @Override
    public List getTopFive() {
        int count = 0;
        List<Film> list = new ArrayList<>();
        for (List<Film> value : map.values()) {
            list.addAll(value);
        }
        Collections.sort(list, Comparator.reverseOrder());
        List<Film> sublist = list.subList(0, 5);
        return sublist;
    }
}
