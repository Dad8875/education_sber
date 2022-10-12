package ru.dad.task2_1;

import java.util.Arrays;
import java.util.Scanner;

/*
7. Возведение в квадрат
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо создать массив, полученный из исходного возведением в квадрат каждого элемента,
упорядочить элементы по возрастанию и вывести их на экран.

Ограничение:
0 < N < 100
-1000 < ai < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
6
-10 -5 1 3 3 8


Пример выходных данных
1 9 9 25 64 100
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] ai = new int[N];
        for (int i = 0; i < ai.length; i++) {
            ai[i] = scanner.nextInt();
        }

        int[] aiSqw = new int[N];
        for (int i = 0; i < aiSqw.length; i++) {
            for (int j = 0; j < ai.length; j++) {
                aiSqw[j] = ai[j] * ai[j];
            }
        }
        Arrays.sort(aiSqw);
        for (int value : aiSqw) {
            System.out.print(value + " ");
        }
    }
}
