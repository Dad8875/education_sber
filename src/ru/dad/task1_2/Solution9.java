package ru.dad.task1_2;

import java.util.Scanner;

/*
Пока Петя практиковался в работе со строками, к нему подбежала его
дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
cos^2(x) - 1 == 0) всегда-всегда выполняется?"
Напишите программу, которая проверяет, что при любом x на входе
тригонометрическое тождество будет выполняться (то есть будет выводить true
при любом x).
Ограничения:
-1000 < x < 1000

 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.println((int)(Math.pow(Math.sin(x), 2) + (Math.pow(Math.cos(x), 2)) - 1) == 0);
    }
}
