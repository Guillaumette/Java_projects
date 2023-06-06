package ru.geekbrains.seminar1.Homework;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("exercise1(str) = " + exercise1(str));
        exercise1(str);
        scanner.close();
    }

    /**
     * @apiNote Дана строка. Поменять местами слова в ней.
     * @param str вводимая строка
     * @return поменянные местами половины исходной строки
     */

    private static String exercise1(String str) {
        str = str.trim();
        String s[] = str.split(" ");
        String res = "";
        for (int i = s.length - 1; i >= 0; i--) {
            res += s[i] + " ";
        }
        return res;
    }
}
