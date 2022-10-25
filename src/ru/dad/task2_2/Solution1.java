package ru.dad.task2_2;

import java.util.Scanner;

/*
Минимальный элемент
На вход передается N — количество столбцов в двумерном массиве и M — количество строк.
Затем сам передается двумерный массив, состоящий из натуральных чисел.

Необходимо сохранить в одномерном массиве и вывести на экран минимальный элемент каждой строки.

Ограничение:
0 < N < 100
0 < M < 100
0 < ai < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
3 2
10 20 15
7 5 9

Пример выходных данных
10 5

 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //количество столбцов
        int M = scanner.nextInt(); //количество строк

        int[][] ai = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ai[i][j] = scanner.nextInt();
            }
        }
        int[] res = new int[M];

        for (int i = 0; i < M; i++) {
            res[i] = ai[i][0];
            for (int j = 0; j < N; j++) {
                if (ai[i][j] < res[i]) {
                    res[i] = ai[i][j];
                }
            }
        }

        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
