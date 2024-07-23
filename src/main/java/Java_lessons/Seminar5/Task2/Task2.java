package Java_lessons.Seminar5.Task2;

//TODO: Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');
        pair.put('<', '>');
        Stack<Character> lifo = new Stack<>();
        String srs = "{a+]}{(d*3)}";
        System.out.println(conditionPairs(srs, pair, lifo));


    }

    private static boolean conditionPairs(String srs, Map<Character, Character> pair, Stack<Character> lifo) {
        for (char c : srs.toCharArray()) {
            if (pair.containsKey(c)) {
                lifo.push(c);
            } else if (pair.containsValue(c)) {
                if (lifo.isEmpty() || pair.get(lifo.pop()) != c) {
                    return false;
                }
            }
        }
        return lifo.isEmpty();
    }
}

