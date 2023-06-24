package ru.geekbrains.seminars.seminars.Seminar5.Classwork;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<Character, Integer> rome = new HashMap<>();
        rome.put('I', 1);
        rome.put('V', 5);
        rome.put('X', 10);
        rome.put('L', 50);
        rome.put('C', 100);
        rome.put('D', 500);
        rome.put('M', 1000);
        String number = "MCMXCIV";
        System.out.println("translate(rome, number) = " + translate(rome, number));
    }

    /**
     * @param rome   HashMap сопоставлений букв и цифр
     * @param number строка с римским числом
     * @return результат перевода, арабское число
     * @apiNote Написать перевод римских цифр в арабские
     */
    private static int translate(Map<Character, Integer> rome, String number) {
        int result = rome.get(number.charAt(number.length() - 1));
        for (int i = 0; i < number.length()- 1; i++) {
            if (rome.containsKey(number.charAt(i))) {
                if (rome.get(number.charAt(i)) < rome.get(number.charAt(i + 1))) {
                    result -= rome.get(number.charAt(i));
                } else {
                    result += rome.get(number.charAt(i));
                }
            }
        }
        return result;
    }
}
