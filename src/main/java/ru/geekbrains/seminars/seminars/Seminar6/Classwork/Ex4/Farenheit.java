package ru.geekbrains.seminars.seminars.Seminar6.Classwork.Ex4;

public class Farenheit implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue * 9.0/5.0 + 32;
    }
}
