package org.example.part_5_OOPrinciple.lesson26homework;

public class Cube extends Rectangle implements Volumetric {

    private int height;

    public Cube(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.print(this);
    }

    @Override
    public double getArea() {
        double polygonA = super.getArea();
        double polygonB = getLength() * height;
        double polygonC = getWidth() * height;
        return (polygonA + polygonB + polygonC) * 2;
    }

    @Override
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Cube:\nlength=%d\nwidth=%d\nheight=%d\narea=%.2f\nvolume=%.2f\n",
                getLength(),getWidth(),height,getArea(),getVolume());
    }
}
