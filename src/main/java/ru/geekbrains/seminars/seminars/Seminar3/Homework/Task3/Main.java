package ru.geekbrains.seminars.seminars.Seminar3.Homework.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Над пропастью во ржи", "Сэлинджер", 600, 1951, 234);
        Book book2 = new Book("Голодные игры", "Коллинз", 800, 2010, 384);
        Book book3 = new Book("1Q84", "Мураками", 1000, 2011, 317);
        Book book4 = new Book("Война и мир", "Толстой", 1200, 1865, 1031);
        Book book5 = new Book("Танец с драконами", "Мартин", 558, 2012, 541);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        List<String> res = checkBook(books);
        for (String re : res) {
            System.out.println(re + " ");
        }
    }

    /**
     * @apiNote проверка, является ли количество страниц простым числом
     * @param num входящее значение числа страниц книги
     * @return простое или нет
     */
    private static boolean isPrime(int num){
        if (num <= 1) return false;
        else if (num <= 3) return true;
        else if (num % 2 == 0 || num % 3 == 0) return false;
        int m = 5;
        while (m * m <= num){
            if (m % num == 0 || m % (num + 2) == 0) return false;
            m += 6;
        }
        return true;
    }

    /**
     * @apiNote выбрать названия книг, в которых простое количество страниц, фамилия автора содержит "А"
     * и год издания после 2010 года включительно
     * @param books входящий список книг
     * @return подходящие по критерям книги
     */
    private static List<String> checkBook(List<Book> books){
        List<String> target = new ArrayList<>();
        for (Book book : books) {
            if (isPrime(book.getPages()) && book.getAuthor().toUpperCase().contains("А") && book.getYear() >= 2010){
                target.add(book.getName());
            }
        }
        return target;
    }
}
