package ru.dad.pm_1.pensum.task1;

import java.util.Arrays;
import java.util.Scanner;

/*
1. На вход подается число n и массив целых чисел длины n.
Вывести два максимальных числа в этой последовательности.
Пояснение: Вторым максимальным числом считается тот, который окажется
максимальным после вычеркивания первого максимума.
Пример:
Входные данные Выходные данные
5
1 3 5 4 5         5 5

3
3 2 1             3 2

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[array.length - 1] + " " + array[array.length - 2]);
    }
}
