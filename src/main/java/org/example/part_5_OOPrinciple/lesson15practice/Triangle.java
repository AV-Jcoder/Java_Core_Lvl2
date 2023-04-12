package org.example.part_5_OOPrinciple.lesson15practice;

public class Triangle {

    private Point point1;
    private Point point2;

    public Triangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void showArea() {
        int a = point1.getX() > point2.getX() ? point1.getX() - point2.getX() : point2.getX() - point1.getX();
        int b = point1.getY() > point2.getY() ? point1.getY() - point2.getY() : point2.getY() - point1.getY();
        double area =  a * (double) b / 2;
        System.out.println("Area is : " + area);
    }

}
