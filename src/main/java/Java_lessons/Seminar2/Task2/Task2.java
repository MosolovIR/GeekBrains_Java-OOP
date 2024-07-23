package Java_lessons.Seminar2.Task2;

//TODO: Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd выход: abcd

public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        StringBuilder res = getResString(str);
        System.out.println(res.toString());
    }

    private static StringBuilder getResString(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                res.append(str.charAt(i + 1));
            }
        }
        return res;
    }
}
