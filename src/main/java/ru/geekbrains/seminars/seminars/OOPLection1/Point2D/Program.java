package ru.geekbrains.seminars.seminars.OOPLection1.Point2D;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0);
        System.out.println(b);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
