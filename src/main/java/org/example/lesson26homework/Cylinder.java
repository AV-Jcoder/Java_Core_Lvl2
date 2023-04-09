package org.example.lesson26homework;

public class Cylinder extends Circle implements Volumetric {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((super.getArea() * 2) + (2 * Math.PI * getRadius() * height));
    }

    @Override
    void draw() {
        super.draw();
    }

    @Override
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder:\nradius=%.2f\nheight=%.2f\narea=%.2f\nvolume=%.2f\n",
                getRadius(),height,getArea(),getVolume());
    }
}
