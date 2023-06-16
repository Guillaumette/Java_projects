package ru.geekbrains.seminars.seminars.Seminar3.ClassWork.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов", 23, 1000, List.of(3, 4, 4));
        Student student2 = new Student("Петрова", 13, 1500, List.of(5, 4, 4));
        Student student3 = new Student("Сидорова", 14, 1000, List.of(3, 5, 4));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            int sum_scores = sumScores(student.getScores());
            if (student.getSurname().endsWith("ова") && sum_scores % 2 == 0) {
                System.out.println(student1.getSalary());
            }
        }
    }

    private static int sumScores(List<Integer> scores) {
        int sum = 0;
        for (Integer score : scores
        ) {
            sum += score;
        }
        return sum;
    }
}


