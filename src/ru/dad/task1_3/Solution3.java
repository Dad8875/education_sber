package ru.dad.task1_3;

import java.util.Scanner;

/*
3. Вычислить выражение
На вход подается два положительных числа m и n.
Необходимо вычислить m^1 + m^2 + ... + m^n

Ограничение:
0 < m, n < 10

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
1 1

Пример выходных данных
1
 */
public class Solution3 {
    public static void main(String[] args) {
        int m, n;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            m = scanner.nextInt();
            n = scanner.nextInt();
        } while (!(m > 0 && n < 10));

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(m, i);
        }
        System.out.println(sum);
    }
}
