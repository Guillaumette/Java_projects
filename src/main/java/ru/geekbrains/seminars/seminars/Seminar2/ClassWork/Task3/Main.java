package ru.geekbrains.seminars.seminars.Seminar2.ClassWork.Task3;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(1, 1, 1);
        System.out.println("vector2.vectorLength() = " + vector2.vectorLength());
        System.out.println("vector1.scalarMulti(vector2) = " + vector1.scalarMulti(vector2));
        System.out.println("vector1.vectorMulti(vector2) = " + vector1.vectorMulti(vector2));
        System.out.println("vector1.vectorCos(vector2) = " + vector1.vectorCos(vector2));
        System.out.println("vector1.vectorSum(vector2) = " + vector1.vectorSum(vector2));
        System.out.println("vector1.vectorDiff(vector2) = " + vector1.vectorDiff(vector2));
    }

}
