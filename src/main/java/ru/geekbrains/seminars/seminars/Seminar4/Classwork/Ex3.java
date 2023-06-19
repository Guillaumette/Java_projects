package ru.geekbrains.seminars.seminars.Seminar4.Classwork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Кол-во элементов: ");
        int n = sc.nextInt();
        LinkedList<Integer> ll = createList(n);
        System.out.println("ll = " + ll);
        changeElemsToSum(ll);
    }

    /**
     * @apiNote Заменить некратные 3 элементы списка суммой нечетных элементов.
     * @param ll созданный linkedlist
     */
    private static void changeElemsToSum(LinkedList<Integer> ll) {
        int sum = 0;
        for (Integer el : ll) {
            if (el % 2 != 0) {
                sum += el;
            }
        }
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) % 3 != 0){
                ll.set(i, sum);
        }
        }
        System.out.println("ll = " + ll);
    }

    /**
     * @param n количество элементов в созданном списке
     * @return новый список
     */
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            ll.add(rd.nextInt(10));
        }
        return ll;
    }
}
