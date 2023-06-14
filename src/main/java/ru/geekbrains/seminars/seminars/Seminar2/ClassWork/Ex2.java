package ru.geekbrains.seminars.seminars.Seminar2.ClassWork;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("exercise2(arr, sc) = " + exercise2(arr, sc));
        }

    /**
     * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов,
     * где первый элемент вдвое больше второго.
     * @param arr входящий массив
     * @param sc для введения с клавиатуры
     * @return результат
     */
        private static int exercise2(int[] arr, Scanner sc) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] * 2) {
                k++;
            }
        }
        return k;
    }
}


