package org.example.lesson26homework;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Circle:\nradius=%.2f\narea=%.2f\n",radius, getArea());
    }
}
