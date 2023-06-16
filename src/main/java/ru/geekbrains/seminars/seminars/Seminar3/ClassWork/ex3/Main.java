package ru.geekbrains.seminars.seminars.Seminar3.ClassWork.ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "красный", "металлический");
        Cube cube3 = new Cube(4, "зеленый", "металлический");
        Cube cube4 = new Cube(2, "желтый", "стальной");
        Cube cube5 = new Cube(2, "желтый", "стальной");
        Cube cube6 = new Cube(2, "желтый", "стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);
        cubeList.add(cube6);
        System.out.println("cubeList = " + cubeList);
        Integer qty = 0;
        Integer volume = 0;
        Integer qtyWood = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("желтый")){
                qty++;
                volume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3){
                qtyWood++;
            }
        }
        System.out.println("qty = " + qty);
        System.out.println("volume = " + volume);
        System.out.println("qtyWood = " + qtyWood);
        System.out.println("uniqueCube(cubeList) = " + uniqueCube(cubeList));
    }

    /**
     *
     * @param cubeList входной список кубов
     * @return уникальная коллекция
     */
    private static Collection uniqueCube(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }

}
