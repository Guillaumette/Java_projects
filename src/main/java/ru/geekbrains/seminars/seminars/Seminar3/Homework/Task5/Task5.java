package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        reshuffle(array, array.length);
    }

    /**
     * @param arr массив значений
     * @param size размер массива
     * @apiNote вернуть массив массивов со всеми перестановками его элементов
     */
    private static void reshuffle(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                reshuffle(arr, size - 1);
                swap(arr, size - 1, k);
            }
        }
    }

    /**
     * @param a массив
     * @param i первое значение
     * @param j второе значение
     */
    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}

