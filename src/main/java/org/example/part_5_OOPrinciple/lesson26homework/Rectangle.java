package org.example.part_5_OOPrinciple.lesson26homework;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.print(this);

    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle:\nlength=%d\nwidth=%d\narea=%.2f\n", length, width, getArea());
    }
}
