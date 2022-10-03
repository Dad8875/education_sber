package ru.dad.task1_2;

import java.util.Scanner;

/*
 "А логарифмическое?" - не унималась дочь.
Напишите программу, которая проверяет, что log(e^n) == n для любого
вещественного n.
Ограничения:
-500 < n < 500
 */
public class Solution10 {
    public static void main(String[] args) {
        double n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextDouble();

        System.out.println(Math.log(Math.pow(Math.E, n)) == n);
    }
}
