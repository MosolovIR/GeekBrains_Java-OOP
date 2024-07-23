package Java_lessons.Seminar4.Task3;

//TODO: 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//TODO: 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printStackContents(intArray);

        String[] strArray = {"one", "two", "three", "four", "five"};
        printQueueContents(strArray);
    }

    public static <T> void printStackContents(T[] array) {
        Stack<T> stack = new Stack<>();

        for (T element : array) {
            stack.push(element);
        }

        System.out.println("Содержимое стэка:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static <T> void printQueueContents(T[] array) {
        Queue<T> queue = new LinkedList<>();

        for (T element : array) {
            queue.offer(element);
        }

        System.out.println("Содержимое очереди:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
