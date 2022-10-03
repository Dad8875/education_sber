package ru.dad.task1_1;

import java.util.Scanner;
/*
На вход подается два целых числа a и b. Вычислите и выведите среднее
квадратическое a и b.
Подсказка:
Среднее квадратическое: https://en.wikipedia.org/wiki/Root_mean_square
Для вычисления квадратного корня воспользуйтесь функцией Math.sqrt(x)
Ограничения:
0 < a, b < 100
*/
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double average = Math.sqrt((a * a + b * b) / 2D);
        System.out.println(average);
    }
}
