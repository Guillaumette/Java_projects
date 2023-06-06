package ru.geekbrains.seminar1.Homework;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();
        System.out.println("exercise2(n, scanner) = " + exer2(n, scanner));
    }

    /**
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует
     * отрицательное число.
     * @param n количество элементов последовательности
     * @param scanner объект класса, с помощью которого вводим с клавиатуры значения последовательности
     * @return результат вычислений (count)
     */
    private static int exer2(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0;
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            System.out.print("Введите следующее число: ");
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                count += a;
            }
            a = b;
        }
        return count;
    }
}