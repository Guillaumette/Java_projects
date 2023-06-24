package ru.geekbrains.seminars.seminars.Seminar5.Homework.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<FIO> listEmpl = employees();
        Map<String, Integer> result = duplicateCount(listEmpl);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        output(list);
    }

    /**
     * @apiNote Считает повторяющиеся имена и выводит с количеством повторений
     * @param listEmpl входной список
     * @return имя (ключ) - сколько раз встречается (значение)
     */
    private static Map<String, Integer> duplicateCount(List<FIO> listEmpl){
        Map<String, Integer> result = new HashMap<>();
        for (FIO employee : listEmpl) {
            result.putIfAbsent(employee.getName(), 1);
            result.put(employee.getName(), result.get(employee.getName()) + 1);
        }
        return result;
    }

    /**
     * @apiNote Метод для вывода результата в терминал
     * @param list входной список
     */
    private static void output(List<Map.Entry<String, Integer>> list){
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /**
     * @apiNote Создание списка имен
     * @return Список сотрудников
     */
    private static List<FIO> employees(){
        List<FIO> fioList = new LinkedList<>();
        FIO fio1 = new FIO("Иван", "Иванов");
        FIO fio2 = new FIO("Кристина", "Белова");
        FIO fio3 = new FIO("Анна", "Мусина");
        FIO fio4 = new FIO("Анна", "Крутова");
        FIO fio5 = new FIO("Иван", "Юрин");
        FIO fio6 = new FIO("Петр", "Лыков");
        FIO fio7 = new FIO("Павел", "Чернов");
        FIO fio8 = new FIO("Петр", "Чернышов");
        FIO fio9 = new FIO("Мария", "Федорова");
        FIO fio10 = new FIO("Марина", "Светлова");
        FIO fio11 = new FIO("Светлана", "Петрова");
        FIO fio12 = new FIO("Мария", "Савина");
        FIO fio13 = new FIO("Мария", "Рыкова");
        FIO fio14 = new FIO("Марина", "Лугова");
        FIO fio15 = new FIO("Анна", "Владимирова");
        FIO fio16 = new FIO("Иван", "Мечников");
        FIO fio17 = new FIO("Петр", "Петин");
        FIO fio18 = new FIO("Иван", "Ежов");
        fioList.add(fio1);
        fioList.add(fio2);
        fioList.add(fio3);
        fioList.add(fio4);
        fioList.add(fio5);
        fioList.add(fio6);
        fioList.add(fio7);
        fioList.add(fio8);
        fioList.add(fio9);
        fioList.add(fio10);
        fioList.add(fio11);
        fioList.add(fio12);
        fioList.add(fio13);
        fioList.add(fio14);
        fioList.add(fio15);
        fioList.add(fio16);
        fioList.add(fio17);
        fioList.add(fio18);
        return fioList;
    }
}
