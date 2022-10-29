package ru.dad.task2_2;

import java.util.Scanner;

/*
3. Шахматы
На вход подается число N — количество строк и столбцов матрицы.
Затем передаются координаты X и Y расположения коня на шахматной доске.

Необходимо заполнить матрицу размера NxN нулями, местоположение коня отметить символом K, а позиции,
которые он может бить, символом X.

Ограничение:
4 < N < 100
0 <= X, Y < N

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
5
0 4

Пример выходных данных
0 0 0 0 0
0 0 0 0 0
0 X 0 0 0
0 0 X 0 0
K 0 0 0 0

*/
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        char[][] ch = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == Y && j == X) {
                    ch[i][j] = 'K';
                } else if (i == Y - 1 && j == X + 2) {
                    ch[i][j] = 'X';
                } else if (i == Y - 2 && j == X + 1) {
                    ch[i][j] = 'X';
                } else if (i == Y - 2 && j == X - 1) {
                    ch[i][j] = 'X';
                } else if (i == Y - 1 && j == X - 2) {
                    ch[i][j] = 'X';
                } else if (i == Y + 1 && j == X - 2) {
                    ch[i][j] = 'X';
                } else if (i == Y + 2 && j == X - 1) {
                    ch[i][j] = 'X';
                } else if (i == Y + 2 && j == X + 1) {
                    ch[i][j] = 'X';
                } else if (i == Y + 1 && j == X + 2) {
                    ch[i][j] = 'X';
                } else {
                    ch[i][j] = '0';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == N - 1) {
                    System.out.print(ch[i][j]);
                } else {
                    System.out.print(ch[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
