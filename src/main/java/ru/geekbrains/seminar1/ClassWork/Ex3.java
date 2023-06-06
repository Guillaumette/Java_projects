package ru.geekbrains.seminar1.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("exercise3(str) = " + exercise3(str));
        exercise3(str);
        scanner.close();
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param str вводимая строка
     * @return поменянные местами половины исходной строки
     */
    private static String exercise3(String str) {
        String sub1 = str.substring(0, str.length()/2);
        String sub2 = str.substring(str.length()/2);
        return sub2 + sub1;

    }
}