package Java_lessons.Seminar2.Task3;

public class Task3 {
    public static void main(String[] args) {
        String stroka = "qwe eWQ".replaceAll("\\s", "").toLowerCase();
        if (stroka.equals(
                new StringBuilder(stroka).reverse().toString())
        ) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
