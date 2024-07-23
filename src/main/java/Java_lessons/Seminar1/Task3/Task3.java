package Java_lessons.Seminar1.Task3;

//TODO: Дана строка. Поменять местами ее половины.

public class Task3 {
    public static void main(String[] args) {
        String str = "qwerty";
        String result = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
        System.out.println("Result = " + result);
    }
}
