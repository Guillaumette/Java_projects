package ru.geekbrains.seminars.seminars.Seminar3.ClassWork.Ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private int salary;
    private List<Integer> scores;
    }

