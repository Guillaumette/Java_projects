package ru.geekbrains.seminars.seminars.Seminar2.ClassWork;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Введите длину последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("exercise1(n, scanner) = " + exercise1(n, scanner));
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
     * перед которыми идет четное число.
     * @param n длина последовательности
     * @param scanner объект класса Scanner для введения значений пользователем с клавиатуры
     * @return сумма, результат
     */
    private static int exercise1(int n, Scanner scanner) {
        int sum = 0;
        System.out.print("Введите первое значение последовательности: ");
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Введите следующее значение: ");
            int n2 = scanner.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) sum += n1;
            n1 = n2;
        }
        return sum;
    }
}
