package ru.dad.task2_2;

import java.util.Scanner;

/*
4. Удаление из матрицы
На вход подается число N — количество строк и столбцов матрицы.
Затем передается сама матрица, состоящая из натуральных чисел.
После этого передается натуральное число P.

Необходимо найти элемент P в матрице и удалить столбец и строку его содержащий
(т.е. сохранить и вывести на экран массив меньшей размерности).
Гарантируется, что искомый элемент единственный в массиве.

Ограничение:
0 < N < 100
0 < ai < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
3
1 2 3
1 7 3
1 2 3
7


Пример выходных данных
1 3
1 3
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] ai = new int[N][N];
        int[][] res = new int[N - 1][N - 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ai[i][j] = scanner.nextInt();
            }
        }

        int P = scanner.nextInt();

        int row = 0;
        int col = 0;

        for (int i = 0; i < ai.length; i++) {
            for (int j = 0; j < ai[i].length; j++) {
                if (ai[i][j] == P) {
                    row = j;
                    col = i;
                }
            }
        }
        int index1 = 0;
        for (int i = 0; i < ai.length; i++) {
            if (i == row) {
                continue;
            }
            int index2 = 0;
            for (int j = 0; j < ai[i].length; j++) {
                if (j == col) {
                    continue;
                }
                res[index1][index2] = ai[i][j];
                index2++;
            }
            index1++;
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (j == N - 2) {
                    System.out.print(res[i][j]);
                } else {
                    System.out.print(res[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}