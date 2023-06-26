package ru.geekbrains.seminars.seminars.Seminar6.Classwork.Ex4;

public class Main {
    public static void main(String[] args) {
        double temp = 1.0;
        convertDegrees(temp);
    }

    /**
     * @apiNote 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
     * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
     * для валидного перевода величин. Метод для конвертации назовите "convertValue"
     * @param temp температура по Цельсию
     */
    private static void convertDegrees(double temp) {
        System.out.println("temp Celcium = " + new Celcium().convertValue(temp));
        System.out.println("temp Farenheit = " + new Farenheit().convertValue(temp));
        System.out.println("temp Kelvin = " + new Kelvin().convertValue(temp));
    }
}
