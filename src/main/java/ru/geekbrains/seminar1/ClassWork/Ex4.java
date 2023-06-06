package ru.geekbrains.seminar1.ClassWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a,b;
        System.out.print("Введите первое число: ");
        a = scanner.nextLine();
        System.out.print("Введите второе число: ");
        b = scanner.nextLine();
        System.out.println("exercise4(a,b) = " + exercise4(a, b));
        exercise4(a, b);
        scanner.close();
    }

    /**
     * @apiNote Выполнить бинарное сложение двух чисел
     * @param a первое число, str
     * @param b второе число, str
     * @return результат операции
     */
    private static String exercise4(String a, String b) {
        if (a.length() < b.length()){
            return exercise4(b, a);
        }
        int carretka = 0; // todo: переименовать валидно
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length()-1; i >= 0; i--) {
            if (a.charAt(i) == '1'){
                carretka++;
            }
            if (j >= 0 && b.charAt(j) == '1'){
                carretka++;
            }
            result = carretka % 2 + result;
            carretka /= 2;
            j--;
        }
        if (carretka > 0){
            result = carretka % 2 + result;
        }
        return result;
    }
}