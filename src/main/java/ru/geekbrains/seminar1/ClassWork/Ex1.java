package ru.geekbrains.seminar1.ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in); // объявляем новый класс и его объект
        int n = scanner.nextInt();
        System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));


        scanner.close();
    }

    /**
     * @apiNote Заданное число возвращает разность между произведением его цифр на сумму его цифр
     * @param n заданное число
     * @return результат
     */
    private static int subtractProductAndSum(int n) {
        int sum = 0, pr = 1;
        while (n != 0){
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return pr - sum;
    }
}

