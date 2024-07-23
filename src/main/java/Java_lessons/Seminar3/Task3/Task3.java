package Java_lessons.Seminar3.Task3;

//TODO: Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Java", "42", "Python", "36"
        ));
        for (String element : list) {
            try {
                Integer.parseInt(element);
                list.remove(element);
            } catch (NumberFormatException ex) {

            }
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            try {
                Integer.parseInt(elem);
                iterator.remove();
            } catch (NumberFormatException ex) {

            }
        }
        System.out.println("list = " + list);
    }
}
