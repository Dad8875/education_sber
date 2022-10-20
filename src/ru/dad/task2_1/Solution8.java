package ru.dad.task2_1;

import java.util.Scanner;

/*
8. Найти ближайшее
На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов.
После этого передается число M.

Необходимо найти в массиве число, максимально близкое к M (т.е. такое число, для которого |ai - M|
минимальное).
Если их несколько, то вывести максимальное число.

Ограничение:
0 < N < 100
-1000 < ai < 1000
-1000 < M < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
6
-10 9 -5 -6 1 -3
-4

Пример выходных данных
-3
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] ai = new int[N];
        for (int i = 0; i < N; i++) {
            ai[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            if (Math.abs((ai[i] - M)) >= Math.abs((ai[i + 1] - M))) {
                result = ai[i + 1];
            }
        }
        System.out.println(result);
    }
}

