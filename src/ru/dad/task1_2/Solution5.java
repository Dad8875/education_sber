package ru.dad.task1_2;

import java.util.Scanner;

/*
 Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
нужно проверить, имеет ли предложенное квадратное уравнение решение или
нет.
На вход подаются три числа — коэффициенты квадратного уравнения a, b, c.
Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.
Ограничения:
-100 < a, b, c < 100
 */
public class Solution5 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (b * b - 4 * a * c > 0) {
            System.out.println("Решение есть");
        } else {
            System.out.println("Решения нет");
        }
    }
}
