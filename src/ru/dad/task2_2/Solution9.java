package ru.dad.task2_2;

import java.util.Scanner;

/*
9. Вывести цифры
На вход подается число N.
Необходимо вывести цифры числа слева направо.
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
1 2 3 7 4
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        printDigit(N);
    }

    static void printDigit(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigit(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
