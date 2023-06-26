package ru.geekbrains.seminars.seminars.Seminar6.Classwork;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<String>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<String>(Arrays.asList("v"));
        Set<String> set = new HashSet<>(mas1);
        ex3(mas1, mas2);

    }

    /** Найти пересечения слов в массивах и указать их общее количество.
     * @apiNote
     * @param mas1 первый массив
     * @param mas2 второй массив
     */
    private static void ex3(List<String> mas1, List<String> mas2) {
        mas2.retainAll(mas1);
        if (mas2.isEmpty()){
            System.out.println("Пересечений не найдено");
            return;
        }
        System.out.println("mas2 = " + mas2);
        for (String s : mas2) {
            int i = 1;
            for (String s1 : mas1) {
                if (s.contains(s1)) i++;
            }
            System.out.println(s + " = " + i);
        }
    }
}
