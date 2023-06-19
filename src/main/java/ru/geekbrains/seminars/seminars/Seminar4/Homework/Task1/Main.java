package ru.geekbrains.seminars.seminars.Seminar4.Homework.Task1;


import java.util.Scanner;

public class Main {
    static ListNode head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addLast(sc);
        printList(head);
        printList(reverseList());
    }

    /**
     * @apiNote Создание связанного списка: добавляем элементы в конец и создаем связи
     * @param sc вводимые элементы с клавиатуры
     */
    private static void addLast(Scanner sc){
        System.out.print("Кол-во элементов: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            ListNode node = new ListNode();
            System.out.print("Введите элемент: ");
            node.setData(sc.nextInt());
            if (head == null){
                head = node;
            } else {
                ListNode current = head;
                while (current.getNext() != null){
                    current = current.getNext();
                }
                current.setNext(node);
            }
        }
    }

    /**
     * @apiNote выводим список на экран
     * @param node узел
     */
    public static void printList(ListNode node){
        ListNode current = node;
        while (current != null){
            System.out.printf("->%d", current.getData());
            current = current.getNext();
        }
        System.out.println();
    }

    /**
     * @apiNote Перевернуть список в обратном порядке
     * @return перевернутый список
     */
    public static ListNode reverseList(){
        ListNode prev = null;
        ListNode current = head;
        while (current != null){
            ListNode tmp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = tmp;
        }
        return prev;
    }
}
