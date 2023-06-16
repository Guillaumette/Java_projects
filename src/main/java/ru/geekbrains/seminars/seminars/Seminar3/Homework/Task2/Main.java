package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Tovar flour = new Tovar("мука", "Россия", 20, 100, 1);
        Tovar flour1 = new Tovar("мука нем", "Германия", 20, 60, 1);
        Tovar bread = new Tovar("хлеб фр", "Франция", 15, 60, 1);
        Tovar pasta = new Tovar("макароны", "Италия", 50, 80, 2);
        Tovar peas = new Tovar("горох", "Китай", 30, 150, 2);
        List<Tovar> tovars = new ArrayList<>();
        tovars.add(flour);
        tovars.add(flour1);
        tovars.add(bread);
        tovars.add(pasta);
        tovars.add(peas);
        List<String> res = minPrice(tovars);
        for (String str : res
        ) {
            System.out.print(str + "; ");

        }
    }

    /**
     * @apiNote вывести наименования товаров заданного сорта с наименьшей ценой
     * @param tovars список товаров
     * @return названия товаров
     */
    private static List<String> minPrice(List<Tovar> tovars){
        int sort = getSort();
        List<String> names = new ArrayList<>();
        int min = findMax(tovars);
        for (Tovar tovar : tovars) {
            if (tovar.getSort() == sort && min > tovar.getPrices()) min = tovar.getPrices();
            }
        for (Tovar tovar : tovars) {
            if (tovar.getPrices() == min){
                names.add(tovar.getName());
            }
        }
        return names;
    }

    /**
     * @apiNote найти максимальную цену
     * @param tovars список товаров
     * @return максимальная цена
     */
    private static int findMax(List<Tovar> tovars){
        int max = 0;
        for (Tovar tovar : tovars) {
            if (max < tovar.getPrices()){
                max = tovar.getPrices();
            }
        }
        return max;
    }

    /**
     * @apiNote до правильного значения
     * @return заданный сорт товара
     */
    private static int getSort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сорт товара (цифрой): ");
        while (true){
            int sort = sc.nextInt();
            switch (sort){
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:{
                    System.out.println("Такого сорта нет");
                    break;
                }
            }
        }
    }
}

