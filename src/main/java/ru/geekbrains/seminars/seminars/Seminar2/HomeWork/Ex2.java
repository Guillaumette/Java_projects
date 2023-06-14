package ru.geekbrains.seminars.seminars.Seminar2.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Введите длину последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("isIncreasing(n, scanner) = " + isIncreasing(n, scanner));
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param n длина последовательности
     * @param scanner объект класса Scanner для введения значений пользователем с клавиатуры
     * @return true или false
     */
    public static boolean isIncreasing(int n, Scanner scanner) {
        System.out.print("Введите первое значение последовательности: ");
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Введите следующее значение: ");
            int n2 = scanner.nextInt();
            if (n1 > n2) return false;
            n1 = n2;
        }
        return true;
    }
}

