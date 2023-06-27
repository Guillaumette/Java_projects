package ru.geekbrains.seminars.seminars.OOPLection1.Robot;

public class Robot2 {
    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * @apiNote Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level){
        this.name = name;
        this.level = level;
    }

    //Методы вкл\выкл подсистем

    /**
     * Кнопка включения робота
     */
    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /**
     * Кнопка выключения робота
     */
    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    /**
     * @apiNote геттер на чтение уровня
     * @return уровень
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * @apiNote геттер на чтение имени
     * @return имя
     */
    public String getName() {
        return this.name;
    }

    /**Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /**Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /**Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /**Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /**Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /**Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /**Работа */
    public void work() {
        System.out.println("Working...");
    }
}
