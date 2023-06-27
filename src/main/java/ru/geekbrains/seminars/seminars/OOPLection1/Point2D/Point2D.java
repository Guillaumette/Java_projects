package ru.geekbrains.seminars.seminars.OOPLection1.Point2D;

public class Point2D {
    /**
     * Это точка 2D
     */
    private int x, y;

    /**
     * @apiNote Это конструктор 2D точки
     * @param valueX координата X
     * @param valueY координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
