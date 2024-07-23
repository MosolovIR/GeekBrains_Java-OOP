package Java_lessons.Seminar1.Task4;

//TODO : Дан массив целых чисел. Верно ли, что массив является симметричным.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введи значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean flag = true;
        flag = isSimmetric(arr, flag);

        if (isSimmetric(arr, flag)) {
            System.out.println("Массив симметричный");
        } else {
            System.out.println("Массив не симметричный");
        }

        System.out.println("Массив выглядит так: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private static boolean isSimmetric(int[] arr, boolean flag) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
