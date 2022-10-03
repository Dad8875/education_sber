package ru.dad.task1_1;

import java.util.Scanner;
/*
На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30
дней.
Ограничения:
0 < count < 100000
*/
public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        double dayBudget = n / 30;
        System.out.println(dayBudget);
    }
}
