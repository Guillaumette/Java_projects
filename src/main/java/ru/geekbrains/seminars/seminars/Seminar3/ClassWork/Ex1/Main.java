package ru.geekbrains.seminars.seminars.Seminar3.ClassWork.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Кол-во наименований: ");
        int n = sc.nextInt();
        List<Item> itemList = generateCollection(n, sc);
        System.out.println("itemList = " + itemList);
        System.out.print("Введите наименование товара: ");
        String searchName = sc.nextLine();
        Integer sumVolume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            // itemList.get(i); как arr[i], только тут не примитивы
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolume += itemList.get(i).getVolume();
                country.add(itemList.get(i).getCountry());
            }
        }
        System.out.println("country = " + country);
        System.out.println("sumVolume = " + sumVolume);
    }

    private static ArrayList<Item> generateCollection(int n, Scanner sc) {
        ArrayList<Item> collection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d элемент ", i+1);
            Item item = new Item();
            System.out.println("Наименование товара: ");
            item.setName(sc.nextLine());
            System.out.println("Страна: ");
            item.setCountry(sc.nextLine());
            System.out.println("Объем: ");
            item.setVolume(sc.nextInt());
            collection.add(item);
        }
        return collection;

    }
}
