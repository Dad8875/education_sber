package ru.dad.task1_2;

import java.util.Scanner;

/*
 После вкусного обеда Петя принимается за подсчет дней до выходных.
Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот
называет только порядковый номер дня недели, что не очень удобно. Поэтому
Петя решил написать программу, которая по порядковому номеру дня недели
выводит сколько осталось дней до субботы. А если же сегодня шестой
(суббота) или седьмой (воскресенье) день, то программа выводит "Ура,
выходные!"
Ограничения:
1 <= n <= 7
 */
public class Solution4 {
    public static final int WEEK = 6;

    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println(WEEK - day);
                break;
            case 2:
                System.out.println(WEEK - day);
                break;
            case 3:
                System.out.println(WEEK - day);
                break;
            case 4:
                System.out.println(WEEK - day);
                break;
            case 5:
                System.out.println(WEEK - day);
                break;
            default:
                System.out.println("Ура, выходные!");
        }
    }
}
