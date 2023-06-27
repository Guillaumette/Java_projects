package ru.geekbrains.seminars.seminars.OOPLection1.Game;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.getDamage(hero2.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        // hero3.getDamage(hero3.Attack()0);
    }
}
