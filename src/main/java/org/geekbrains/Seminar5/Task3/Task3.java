package org.geekbrains.Seminar5.Task3;

//TODO: Написать метод, который переведет число из римского формата записи в арабский.
// I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.
// Пример: MMXXII = 2022

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Character, Integer> data = new HashMap<>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);

        String rimData = "IX";
        int arabData = data.get(rimData.charAt(rimData.length()-1));

        for (int i = 0; i < rimData.length() - 1; i++) {
            if (data.get(rimData.charAt(i)) < data.get(rimData.charAt(i + 1))) {
                arabData -= data.get(rimData.charAt(i));
            } else{
                arabData += data.get(rimData.charAt(i));
            }
            System.out.println("arabData = " + arabData);
        }
    }
}
