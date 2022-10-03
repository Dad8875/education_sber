package ru.dad.task1_2;

import java.util.Scanner;

/*
Разобравшись со своими (и не только) задачками, Петя уже собирался
лечь спать и отдохнуть перед очередным тяжелым рабочим днем, но вдруг в
тишине раздается детский шепот: "Паааапааа, мы забыли решить ещё одну
задачку! Давай проверим, можно ли из трех сторон составить треугольник?".
Что ж, придется написать еще одну программу, связанную со школьной
математикой.
На вход подается три целых положительных числа – длины сторон
треугольника. Нужно вывести true, если можно составить треугольник из этих
сторон и false иначе.
Ограничения:
0 < a, b, c < 100
 */
public class Solution11 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

        int max = Math.max(Math.max(a, b), c);
        System.out.println(max < (a + b) && max < (a + c) && max < (b + c));
    }
}
