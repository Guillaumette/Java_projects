package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String name;
    private Integer prices;
    private String sort;
}
