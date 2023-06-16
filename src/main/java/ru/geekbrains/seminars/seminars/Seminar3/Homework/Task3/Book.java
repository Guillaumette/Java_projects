package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private String author;
    private Integer price;
    private Integer year;
    private Integer pages;
}
