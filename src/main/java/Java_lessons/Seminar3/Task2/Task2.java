package Java_lessons.Seminar3.Task2;

//TODO: Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(2);
        ArrayList<String> result = getRndPlanetsInList(list);
        System.out.println("Всего планет в списке: " + result.size() + " -> " + result);
        solution2_1(result);
        solution2_2(result);
    }

    private static void solution2_1(ArrayList<String> result) {
        Collections.sort(result);
        int count = 0;
        String planet = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).equals(planet)) {
                count++;
            } else {
                System.out.println("Планет под названием" + "'" + planet + "' -> " + count);
                count = 1;
                planet = result.get(i);
            }
        }
        System.out.println("Планет под названием" + "'" + planet + "' -> " + count);
    }

    private static void solution2_2(ArrayList<String> result) {
        ArrayList<String> uniqueList = new ArrayList<>();
        for (int i = 1; i < result.size(); i++) {
            if (!result.get(i).equals(result.get(i - 1))) {
                uniqueList.add(result.get(i - 1));
            }
        }
        Collections.sort(uniqueList);
        System.out.println(uniqueList);
    }

    public static ArrayList getRndPlanetsInList(ArrayList list) {
        for (int i = 0; i < 5; i++) {
            int rndPlanet = (int) (Math.random() * 8);
            switch (rndPlanet) {
                case 0:
                    list.add(i, "Меркурий");
                case 1:
                    list.add(i, "Венера");
                case 2:
                    list.add(i, "Земля");
                case 3:
                    list.add(i, "Марс");
                case 4:
                    list.add(i, "Юпитер");
                case 5:
                    list.add(i, "Сатурн");
                case 6:
                    list.add(i, "Уран");
                case 7:
                    list.add(i, "Нептун");
            }
        }
        return list;
    }
}
