package ru.geekbrains.seminars.seminars.Seminar2.HomeWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = sc.nextInt();
        }
        int[] resArr = changeElems(arr);
        for (int elem : resArr) {
            System.out.print(elem + " ");
        }
    }

    /**
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param arr входной массив
     * @return сумма индексов двузначных элементов
     */
    public static int findSum(int[] arr) {
        int sum_i = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10 && arr[i] < 100) {
                sum_i += i;
            }
        }
        return sum_i;
    }

    /**
     * @param arr входной массив
     * @return результирующий массив с заменой отрицательныых элементов на сумму индексов двузначных
     */
    private static int[] changeElems(int[] arr) {
        int [] resultArray = new int[arr.length];
        int sum = findSum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) resultArray[i] = sum;
            else resultArray[i] = arr[i];
        }
        return resultArray;
    }
}
