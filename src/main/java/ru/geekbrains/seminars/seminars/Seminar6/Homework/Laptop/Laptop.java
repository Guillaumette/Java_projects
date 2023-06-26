package ru.geekbrains.seminars.seminars.Seminar6.Homework.Laptop;

import java.util.Objects;

public class Laptop {
    private String manufacturer;
    private String color;
    private Integer ram;
    private Integer ssd;
    private String os;
    private Integer videocard;
    private Integer price;

    public Laptop(){

    }

    public Laptop(String manufacturer, String color, Integer ram, Integer ssd, String os, Integer videocard, Integer price){
        this.manufacturer = manufacturer;
        this.color = color;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.videocard = videocard;
        this.price = price;
    }

    public String Manufacturer(){
        return manufacturer;
    }

    public String Color() {
        return color;
    }

    public Integer RAM() {
        return ram;
    }
    public Integer SSD() {
        return ssd;
    }

    public String OS() {
        return os;
    }

    public Integer Videocard() {
        return videocard;
    }

    public Integer Price() {
        return price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return Objects.equals(manufacturer, laptop) && Objects.equals(color, laptop.color) &&
               Objects.equals(ram, laptop.ram) && Objects.equals(ssd, laptop.ssd) &&
               Objects.equals(os, laptop.os) && Objects.equals(videocard, laptop.videocard) &&
               Objects.equals(price, laptop.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, color, ram, ssd, os, videocard, price);
    }

    @Override
    public String toString() {
        return "\n" + " Ноутбук " + manufacturer + ' ' + color + " (" +
                "RAM " + ram + "ГБ" +
                ", SSD " + ssd + "ГБ" +
                ", " + os + ", " + "видеокарта объемом " +
                videocard + "ГБ" +
                ", " + price + " рублей" +
                ')';
    }
}
