package org.geekbrains.Seminar5.Task1;

//TODO: Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же.
// (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(areIsomorphic("add", "egg"));
        System.out.println(areIsomorphic("foo", "bar"));
        System.out.println(areIsomorphic("paper", "title"));

    }

    public static boolean areIsomorphic (String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                char c1 = a.charAt(i);
                char c2 = b.charAt(i);

                if (!map.containsKey(c1)) {
                    map.put(c1, c2);
                } else {
                    if (map.get(c1) != c2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
