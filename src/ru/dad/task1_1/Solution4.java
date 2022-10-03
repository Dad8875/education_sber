package ru.dad.task1_1;

import java.util.Scanner;
/*
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты.
Ограничения:
0 < count < 86400
*/
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int hour = count / 3600;
        int minute = (count - hour * 3600) / 60;

        System.out.println(hour + " " + minute);
    }
}
