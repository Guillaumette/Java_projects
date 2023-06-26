package ru.geekbrains.seminars.seminars.Seminar6.Homework.Laptop;

import java.util.LinkedList;
import java.util.List;

public class Filter {

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по производителю
     */
    public static List<Laptop> filtMan(List<Laptop> laptops, String val) {
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.Manufacturer().toLowerCase().equals(val)) {
                result.add(laptop);
            }
        }
        return result;
    }

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по цвету
     */
    public static List<Laptop> filtCol(List<Laptop> laptops, String val) {
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.Color().toLowerCase().equals(val)) {
                result.add(laptop);
            }
        }
        return result;
    }

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по объему ОЗУ
     */
    public static List<Laptop> filtRAM(List<Laptop> laptops, String val) {
        Integer ram = Integer.parseInt(val);
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.RAM() >= ram) {
                result.add(laptop);
            }
        }
        return result;
    }

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по объему памяти диска SSD
     */
    public static List<Laptop> filtSSD(List<Laptop> laptops, String val) {
        Integer ssd = Integer.parseInt(val);
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.RAM() >= ssd) {
                result.add(laptop);
            }
        }
        return result;
    }

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по типу операционной системы
     */
    public static List<Laptop> filtOS(List<Laptop> laptops, String val) {
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.OS().toLowerCase().equals(val)) {
                result.add(laptop);
            }
        }
        return result;
    }

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по объему памяти видеокарты
     */
    public static List<Laptop> filtVid(List<Laptop> laptops, String val) {
        Integer vid = Integer.parseInt(val);
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.Videocard() >= vid) {
                result.add(laptop);
            }
        }
        return result;
    }

    /**
     * @param laptops список всех ноутбуков
     * @param val     вводимый пользователем параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote фильтр ноутбуков по цене
     */
    public static List<Laptop> filtPrice(List<Laptop> laptops, String val) {
        Integer price = Integer.parseInt(val);
        List<Laptop> result = new LinkedList<>();
        for (Laptop laptop : laptops) {
            if (laptop.Price() >= price) {
                result.add(laptop);
            }
        }
        return result;
    }
}