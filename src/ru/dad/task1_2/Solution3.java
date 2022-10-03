package ru.dad.task1_2;

import java.util.Scanner;

/*
Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
обед строго после полудня. Периодически он посматривает на часы (x - час,
который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
время больше полудня, то вывести "Пора". Иначе - “Рано”.
Ограничения:
0 <= n <= 23
 */
public class Solution3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n >= 0 && n <= 12) {
            System.out.println("Рано");
        }
        if (n > 12 && n <= 23) {
            System.out.println("Пора");
        }
    }
}
