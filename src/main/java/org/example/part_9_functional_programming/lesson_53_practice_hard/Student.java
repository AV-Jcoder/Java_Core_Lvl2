package org.exampl1e.part_9_functional_programming.lesson_53_practice_hard;

import java.util.List;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private int course;
    private List<Integer> marks;

    public Student(String firstName, String lastName, int course, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.marks = marks;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (!firstName.equals(student.firstName)) return false;
        if (!lastName.equals(student.lastName)) return false;
        return Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + course;
        result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
