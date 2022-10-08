package ru.dad.task1_3;

import java.util.Scanner;

/*
2. Сумма чисел
На вход подается два положительных числа m и n.
Найти сумму чисел между m и n включительно.

Ограничение:
0 < m, n < 10
m < n

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
7 9

Пример выходных данных
24
 */
public class Solution2 {
    public static void main(String[] args) {
        int m, n;

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            m = scanner.nextInt();
            n = scanner.nextInt();
        } while (!(m > 0 && n < 10 && m < n));

        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
