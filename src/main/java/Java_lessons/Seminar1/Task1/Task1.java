package Java_lessons.Seminar1.Task1;

//TODO : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getSumMinusPr(n);
        System.out.println("Result = " + result);
    }

    /**
     * @apiNote до описания
     * @param n - начальное значение
     * @return произведение минус сумма
     */

    private static int getSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;

        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}