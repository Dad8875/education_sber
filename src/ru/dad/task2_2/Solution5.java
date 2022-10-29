package ru.dad.task2_2;

import java.util.Scanner;

/*
5. Проверить симметричность
На вход подается число N — количество строк и столбцов матрицы.
Затем передается сама матрица, состоящая из натуральных чисел.

Необходимо вывести true, если она является симметричной относительно побочной диагонали, false иначе.

Побочной диагональю называется диагональ, проходящая из верхнего правого угла в левый нижний.

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
4 5 6
7 8 9


Пример выходных данных
false
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] ai = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ai[i][j] = scanner.nextInt();
            }
        }
        boolean result = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (ai[i][j] != ai[N - 1 - j][N - 1 - i]) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
