package ru.geekbrains.seminars.seminars.Seminar6.Classwork.Ex4;

public class Kelvin implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}
