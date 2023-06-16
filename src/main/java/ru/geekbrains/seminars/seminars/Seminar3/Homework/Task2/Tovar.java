package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tovar {
    private String name;
    private String country;
    private Integer weight;
    private Integer prices;
    private Integer sort;


}
