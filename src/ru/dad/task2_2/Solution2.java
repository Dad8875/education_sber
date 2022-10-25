package ru.dad.task2_2;

import java.util.Scanner;

/*
2. Нарисовать прямоугольник
На вход подается число N — количество строк и столбцов матрицы.
Затем в последующих двух строках подаются координаты X (номер столбца) и Y (номер строки) точек,
которые задают прямоугольник.

Необходимо отобразить прямоугольник с помощью символа 1 в матрице, заполненной нулями (см. пример) и
вывести всю матрицу на экран.

Ограничение:
0 < N < 100
0 <= X1, Y1, X2, Y2 < N
X1 < X2
Y1 < Y2

Пример входных данных
7
1 2
3 4

Пример выходных данных
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 1 1 1 0 0 0
0 1 0 1 0 0 0
0 1 1 1 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0

*/
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();

        int[][] ai = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i == Y1 && j >= X1 && j <= X2) || (i == Y2 && j >= X1 && j <= X2)
                        || (j == X1 && i >= Y1 && i <= Y2) || (j == X2 && i >= Y1 && i <= Y2))
                    ai[i][j] = 1;
                 else
                    ai[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == N - 1) {
                    System.out.print(ai[i][j]);
                } else {
                    System.out.print(ai[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
