package ru.dad.task1_1;

import java.util.Scanner;
/*
Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
Подсказка: считать по формуле V  =  4/3 * pi * r^3. Значение числа pi взять из Math.

Ограничения: 0 < r < 100
*/
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);

        System.out.println(volume);
    }
}
