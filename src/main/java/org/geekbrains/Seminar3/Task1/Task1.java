package org.geekbrains.Seminar3.Task1;

//TODO: Задание №1 Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;


public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(10);
        System.out.println("До сортировки: " + getRndNumInList(list));
        Collections.sort(list);
        System.out.println("После сортировки: " + list);
    }

    public static ArrayList getRndNumInList(ArrayList list) {
        for (int i = 0; i < 10; i++) {
            int rndNum = (int) (Math.random() * 100);
            list.add(i, rndNum);
        }
        return list;
    }
}
