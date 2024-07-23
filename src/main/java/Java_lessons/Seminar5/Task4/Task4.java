package Java_lessons.Seminar5.Task4;

//TODO: Написать метод, который переведёт данное целое число в римский формат.
// I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Character> data = new HashMap<>();
        data.put(1, 'I');
        data.put(5, 'V');
        data.put(10, 'X');
        data.put(50, 'L');
        data.put(100, 'C');
        data.put(500, 'D');
        data.put(1000,'M');

        String rimData = "9";
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
