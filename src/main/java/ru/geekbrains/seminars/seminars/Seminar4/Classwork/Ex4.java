package ru.geekbrains.seminars.seminars.Seminar4.Classwork;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, -3, -2, -1, 4, 5, -6, 7));
        System.out.println("ll = " + ll);
        remElem(ll);
    }

    private static void remElem(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) < 0){
                ll.remove(i);
                --i;
            }
        }
        System.out.println("ll = " + ll);
    }

}
