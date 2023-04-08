package org.example.lesson15practice;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Здесь нет разницы от какой точки отнимать
     * соответствующие координаты, потому что при
     * возведении в квадрат все равно получится
     * положительное число.
     * @param x - Координата Х
     * @param y - координата У
     * @return - дистанция
     */
    public double getDistance(int x, int y) {
        int a = this.x - x;
        int b = this.y - y;
        double c = Math.sqrt((a * a + b * b));
        return c;
    }
}
