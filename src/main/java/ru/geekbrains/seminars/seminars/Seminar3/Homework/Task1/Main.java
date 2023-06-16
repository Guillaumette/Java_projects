package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Item flour = new Item("мука высший сорт", 100, "1");
        Item bread = new Item("хлеб средний сорт", 50, "2");
        Item pasta = new Item("макароны низший сорт", 60, "3");
        Item peas = new Item("горох высший сорт", 200, "1");
        List<Item> items = new ArrayList<>();
        items.add(flour);
        items.add(bread);
        items.add(pasta);
        items.add(peas);

        String search = "высший";
        List<Integer> listPrices = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().contains(search)) {
                listPrices.add(items.get(i).getPrices());
            }
        }

        int max = 0;
        for (int i = 0; i < listPrices.size(); i++) {
            if (listPrices.get(i) > max) {
                max = listPrices.get(i);
            }
        }
        System.out.println(max);

    }
}

