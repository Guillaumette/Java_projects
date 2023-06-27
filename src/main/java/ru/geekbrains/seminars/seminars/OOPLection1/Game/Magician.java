package ru.geekbrains.seminars.seminars.OOPLection1.Game;

import java.util.Random;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number), r.nextInt(100, 200));
        this.maxMana = r.nextInt(50, 150);
        this.mana = maxMana;
    }

    /**
     * @return значение наносимого персонажем урона
     * @apiNote метод атаки
     */
    public int Attack() {
        int damage = r.nextInt(20, 30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    /**
     * @return статы персонажа
     * @apiNote Метод получения информации о персонаже
     */
    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}