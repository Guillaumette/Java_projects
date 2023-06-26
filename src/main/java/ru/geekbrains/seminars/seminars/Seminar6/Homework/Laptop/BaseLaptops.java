package ru.geekbrains.seminars.seminars.Seminar6.Homework.Laptop;

import java.util.LinkedList;
import java.util.List;

/**
 * @apiNote датасет ноутбуков
 * @return заполненный лист ноутбуков
 */
public class BaseLaptops {
    public static List<Laptop> data() {
        List<Laptop> laptop = new LinkedList<>();
        Laptop l1 = new Laptop("ASUS", "черный", 8, 512, "none", 6, 80000);
        Laptop l2 = new Laptop("Acer", "серебристый", 8, 512, "windows", 4, 76000);
        Laptop l3 = new Laptop("MSI", "черный", 16, 512, "windows", 4, 88000);
        Laptop l4 = new Laptop("Huawei", "белый", 16, 1024, "linux", 6, 150000);
        laptop.add(l1);
        laptop.add(l2);
        laptop.add(l3);
        laptop.add(l4);
        return laptop;
    }
}