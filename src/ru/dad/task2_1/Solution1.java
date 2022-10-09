package ru.dad.task2_1;

import java.util.Scanner;

/*
1. Посчитать среднее арифметическое
На вход подается число N — длина массива.
Затем передается массив вещественных чисел (ai) из N элементов.

Необходимо реализовать метод, который принимает на вход полученный массив и возвращает
среднее арифметическое всех чисел массива.
Вывести среднее арифметическое на экран.

Ограничение:
0 < N < 100
0 < ai < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
3
1.5 2.7 3.14

Пример выходных данных
2.4466666666666668
 */
public class Solution1 {
    public static void main(String[] args) {
        int N = 0;

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        double[] ai = new double[N];

        for (int i = 0; i < ai.length; i++) {
            ai[i] = scanner.nextDouble();
        }
        System.out.println(averageToArray(ai));
    }

    public static double averageToArray(double[] array) {
        double result = 0;
        for (double v : array) {
            result += v / array.length;
        }
        return result;
    }
}
