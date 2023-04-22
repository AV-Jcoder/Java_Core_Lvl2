package org.example.part_9_functional_programming.lesson_53_practice_hard;

import java.util.List;
import java.util.Objects;

public class Statistic {

    private List<String> students;
    private double avgMark;

    public Statistic(List<String> students, double avgMark) {
        this.students = students;
        this.avgMark = avgMark;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistic statistic = (Statistic) o;
        if (Double.compare(statistic.avgMark, avgMark) != 0) return false;
        return Objects.equals(students, statistic.students);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = students != null ? students.hashCode() : 0;
        temp = Double.doubleToLongBits(avgMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "students=" + students +
                ", avgMark=" + avgMark +
                '}';
    }
}
