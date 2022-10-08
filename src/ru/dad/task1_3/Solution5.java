package ru.dad.task1_3;

import java.util.Scanner;

/*
5. Взятие остатка
Даны положительные натуральные числа m и n.
Найти остаток от деления m на n, не выполняя операцию взятия остатка.

Ограничение:
0 < m, n < 10

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
9 1

Пример выходных данных
0
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0, n = 0;
        do {
            m = scanner.nextInt();
            n = scanner.nextInt();
        } while (!(m > 0 && n < 10));
        System.out.println(m - (m / n) * n);
    }
}
