package org.example.part_7_Collections.lesson40practice.task2;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double avgMark;

    public Student(String firstName, String lastName, int age, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.avgMark = avgMark;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Student:\n%s %s, age=%d, average mark=%.2f", lastName, firstName, age, avgMark);
    }
}
