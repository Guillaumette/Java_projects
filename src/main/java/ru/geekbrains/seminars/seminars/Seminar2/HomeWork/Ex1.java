package ru.geekbrains.seminars.seminars.Seminar2.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Введите длину последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("exercise1(n, scanner) = " + exercise1(n, scanner));
    }

    /**
     * @apiNote метод проверки числа на простоту
     * @param num проверяемое число
     * @return результат
     */
    public static boolean isPrime(int num){
        if (num <= 1) return false;
        else if (num <= 3) return true;
        else if (num % 2 == 0 || num % 3 == 0) return false;
        int m = 5;
        while (m * m <= num){
            if (m % num == 0 || m % (num + 2) == 0) return false;
            m += 6;
        }
        return true;
    }

        /**
         * @apiNote Дана последовательность из N целых чисел. Найти сумму простых чисел.
         * @param n длина последовательности
         * @param scanner объект класса Scanner для введения значений пользователем с клавиатуры
         * @return сумма, результат
         */

    private static int exercise1(int n, Scanner scanner){
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            System.out.print("Введите значение последовательности: ");
            int nb = scanner.nextInt();
            if (isPrime(nb)){
                sum += nb;
            }

        }
        return sum;
    }
}
