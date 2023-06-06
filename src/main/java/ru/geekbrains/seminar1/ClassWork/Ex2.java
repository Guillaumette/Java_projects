package ru.geekbrains.seminar1.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt(); // кол-во элементов последовательности
        System.out.println("exercise2(n, scanner) = " + exercise2(n, scanner));
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
     * отрицательное число.
     * @param n количество элементов последовательности
     * @param scanner объект класса, с помощью которого вводим с клавиатуры значения последовательности
     * @return результат вычислений (count)
     */
    private static int exercise2(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0; // переменные для введения значений последовательности
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            System.out.print("Введите следующее число число: ");
            b = scanner.nextInt();
            if (a > 0 && b < 0) count++;
            a = b;
        }
        scanner.close();
        return count;
    }
}