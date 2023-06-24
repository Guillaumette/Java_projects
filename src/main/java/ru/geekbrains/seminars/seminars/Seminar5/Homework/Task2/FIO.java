package ru.geekbrains.seminars.seminars.Seminar5.Homework.Task2;

import java.util.Objects;

public class FIO {
    private String Name;
    private String Surname;

    public FIO(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public FIO() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FIO fio = (FIO) obj;
        return Objects.equals(Name, fio.Name) && Objects.equals(Surname, fio.Surname);
    }

        @Override
        public int hashCode () {
            return Objects.hash(Name, Surname);
        }

        @Override
        public String toString () {
            return "[" +
                    "Name='" + Name + '\'' +
                    ", SurName='" + Surname + '\'' +
                    ']';
        }
    }
