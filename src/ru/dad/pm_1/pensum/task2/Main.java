package ru.dad.pm_1.pensum.task2;

import java.util.Scanner;

/*
2. На вход подается число n, массив целых чисел отсортированных по
возрастанию длины n и число p. Необходимо найти индекс элемента массива
равного p. Все числа в массиве уникальны. Если искомый элемент не найден,
вывести -1.
Решить задачу за логарифмическую сложность.
Пример:
Входные данные Выходные данные
5
-42 -12 3 5 8       3
5

2
17 19              -1
20
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == p) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }
}
