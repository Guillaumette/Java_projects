package ru.geekbrains.seminars.seminars.Seminar5.Classwork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 1, 6};
        System.out.println("checkDublicates(array) = " + checkDublicates(array));
    }

    /**
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     * @param array входной массив
     * @return результат
     */
    private static boolean checkDublicates(int[] array) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (intMap.containsKey(array[i])){
                return true;
            } else {
                intMap.put(array[i], 1);
            }
        }
        return false;
    }
}
