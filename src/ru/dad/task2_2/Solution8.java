package ru.dad.task2_2;

import java.util.Scanner;

/*
8. Сумма цифр
На вход подается число N.
Необходимо посчитать и вывести на экран сумму его цифр.
Решить задачу нужно через рекурсию.

Ограничение:
0 < N < 1000000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
12374


Пример выходных данных
17
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(sum(N));

    }

    static int sum(int n) {
        int result;
        if (n == 0) {
            return 0;
        } else {
            result = n % 10 + sum(n / 10);
        }
        return result;
    }
}
