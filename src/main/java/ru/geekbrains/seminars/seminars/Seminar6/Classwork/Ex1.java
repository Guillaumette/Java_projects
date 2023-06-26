package ru.geekbrains.seminars.seminars.Seminar6.Classwork;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        // Дан массив чисел, посчитать процент уникальных чисел.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        Set<Integer> set = new HashSet<>(list);
//        for (Integer integer : list) {
//            set.add(integer);
//        }

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        int result = set.size() * 100 / list.size();
        System.out.println("result = " + result);
    }
}
