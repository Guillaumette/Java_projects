package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = sc.nextInt();
        sc.close();
        List<Integer> list = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rn.nextInt(100));
        }
        System.out.println(list);
        System.out.println("максимум:" + Collections.max(list));
        System.out.println("минимум:" + Collections.min(list));
        System.out.println("среднее:" + list.stream().mapToInt(e -> e).average().orElse(0));
    }
}
