package ru.dad.task1_2;

import java.util.Scanner;

/*
За каждый год работы Петя получает на ревью оценку. На вход
подаются оценки Пети за последние три года (три целых положительных числа).
Если последовательность оценок строго монотонно убывает, то вывести "Петя,
пора трудиться"
В остальных случаях вывести "Петя молодец!"
Ограничения:
0 < a, b, c < 100
 */
public class Solution1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя молодец!");
        }
    }
}
