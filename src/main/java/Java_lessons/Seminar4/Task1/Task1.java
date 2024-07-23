package Java_lessons.Seminar4.Task1;

//TODO: Реализовать консольное приложение, которое:
//TODO: 1. Принимает от пользователя строку вида text~num
//TODO: 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//TODO: 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean programStatus = true;

        while (programStatus) {
            System.out.println("Введите команду:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split("~");
            if (parts.length != 2) {
                System.out.println("Неверный формат ввода. Ожидается 'text~num' или 'print~num'.");
                continue;
            }

            String text = parts[0];
            int number;
            try {
                number = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа.");
                continue;
            }

            if (text.equalsIgnoreCase("print")) {
                if (number >= 0 && number < list.size()) {
                    System.out.println("Значение на позиции " + number + ": " + list.get(number));
                    list.remove(number);
                } else {
                    System.out.println("Неверный индекс.");
                }
            } else {
                if (number >= 0 && number <= list.size()) {
                    list.add(number, text);
                } else {
                    System.out.println("Неверный индекс.");
                }
            }
        }
    }
}
