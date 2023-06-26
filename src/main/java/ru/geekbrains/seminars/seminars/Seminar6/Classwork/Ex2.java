package ru.geekbrains.seminars.seminars.Seminar6.Classwork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        // найти пересечение двух множеств
        // set1= [1,2,3,4]
        // set2= [3,5,6,7]
        // Вывод в консоль:
        // [3]
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        System.out.println("set3 = " + set3);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
    }
}
