package ru.dad.task1_1;

import java.util.Scanner;
/*
На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
тугриков. Вычислите и выведите, сколько гостей можно пригласить на
мероприятие.
Ограничения:
0 < n < 100000
0 < k < 1000
k < n
 */
public class Solution9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int budgetOneGuest = scanner.nextInt();

        int count = (int) n / budgetOneGuest;

        System.out.println(count);
    }
}
