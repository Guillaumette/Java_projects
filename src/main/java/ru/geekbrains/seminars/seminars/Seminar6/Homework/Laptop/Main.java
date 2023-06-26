package ru.geekbrains.seminars.seminars.Seminar6.Homework.Laptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = BaseLaptops.data();
        System.out.println(laptops);
        System.out.println("\nВведите цифру, соответствующую критерию фильтра: \n" +
                "1. Производитель\n" +
                "2. Цвет\n" +
                "3. Объем ОЗУ\n" +
                "4. Объем SSD\n" +
                "5. Операционная система\n" +
                "6. Видеокарта\n" +
                "7. Цена\n" +
                "0. Выход");
        Map<String, String> criterion = criteria(laptops);
        laptops = filterLaptop(laptops, criterion);
        System.out.println(laptops);
    }

    private static Map<String, String> criteria(List<Laptop> laptops) {
        Scanner input = new Scanner(System.in);
        Map<String, String> criterion = new HashMap<>();
        int n = input.nextInt();
        while (n != 0) {
            switch (n) {
                case 1 -> {
                    System.out.print("Введите производителя: ");
                    String tmp = input.next().trim().toLowerCase();
                    criterion.put("Производитель", tmp);
                }
                case 2 -> {
                    System.out.print("Введите желаемый цвет: ");
                    String tmp = input.next().trim().toLowerCase();
                    criterion.put("Цвет", tmp);
                }
                case 3 -> {
                    System.out.print("Введите минимальный объем ОЗУ: ");
                    String tmp = input.next().trim().toLowerCase();
                    criterion.put("ОЗУ", tmp);
                }
                case 4 -> {
                    System.out.print("Введите минимальный объем SSD: ");
                    String tmp = input.next().trim();
                    criterion.put("SSD", tmp);
                }
                case 5 -> {
                    System.out.print("Введите операционную систему: ");
                    String tmp = input.next().trim().toLowerCase();
                    criterion.put("Операционная система", tmp);
                }
                case 6 -> {
                    System.out.print("Введите минимальный объем видеокарты: ");
                    String tmp = input.next().trim();
                    criterion.put("Видеокарта", tmp);
                }
                case 7 -> {
                    System.out.print("Введите минимальную цену: ");
                    String tmp = input.next().trim();
                    criterion.put("Цена", tmp);
                }
                default -> {
                    System.out.println("Введено некорректное значение");
                }
            }
            System.out.println("Введите следующий критерий: ");
            n = input.nextInt();
        }
        return criterion;
    }

    private static List<Laptop> filterLaptop(List<Laptop> laptops, Map<String, String> criterion) {
        for (Map.Entry<String, String> entry : criterion.entrySet()) {
            if (entry.getKey().equals("Производитель")) laptops = Filter.filtMan(laptops, entry.getValue());
            if (entry.getKey().equals("Цвет")) laptops = Filter.filtCol(laptops, entry.getValue());
            if (entry.getKey().equals("ОЗУ")) laptops = Filter.filtRAM(laptops, entry.getValue());
            if (entry.getKey().equals("SSD")) laptops = Filter.filtSSD(laptops, entry.getValue());
            if (entry.getKey().equals("Операционная система")) laptops = Filter.filtOS(laptops, entry.getValue());
            if (entry.getKey().equals("Видеокарта")) laptops = Filter.filtVid(laptops, entry.getValue());
            if (entry.getKey().equals("Цена")) laptops = Filter.filtPrice(laptops, entry.getValue());
        }
        return laptops;
    }
}
