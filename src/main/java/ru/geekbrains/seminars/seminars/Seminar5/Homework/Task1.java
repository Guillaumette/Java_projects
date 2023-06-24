package ru.geekbrains.seminars.seminars.Seminar5.Homework;

import java.io.BufferedReader;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine().toLowerCase().trim();
        str = str.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println("Введите искомое слово: ");
        String targetWord = sc.nextLine();
        countWords(str, targetWord);
    }

    /**
     * @apiNote Посчитать через map, сколько раз встречается слово
     * @param str входная строка
     * @param targetWord искомое слово
     */
    private static void countWords(String str, String targetWord) {
        String[] arrStr = str.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : arrStr) {
            if (!targetWord.toLowerCase().equals((word.toLowerCase()))) {
                continue;
            }
            int count = result.getOrDefault(targetWord.toLowerCase(), 0);
            result.put(word.toLowerCase(), ++count);
        }
        System.out.println(targetWord + " - " + result.getOrDefault(targetWord.toLowerCase(), 0));
    }
}



