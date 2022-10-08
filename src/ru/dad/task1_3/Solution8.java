package ru.dad.task1_3;

import java.util.Scanner;

/*
8. Вычислить сумму
На вход подается:
- целое число n
- целое число p
- целые числа a1, a2 , … an

Необходимо вычислить сумму всех чисел a1, a2, a3 … an которые строго больше p.

Ограничение:
0 < m, n, ai < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
2
18
95 31

Пример выходных данных
126
 */
public class Solution8 {
    public static void main(String[] args) {
        int n, p;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            n = scanner.nextInt();
            p = scanner.nextInt();
        } while (!(n > 0 && p > 0));

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int value : a) {
            if (value < p || value > 1000)
                continue;
            sum += value;
        }
        System.out.println(sum);
    }
}
