package ru.dad.task1_1;

import java.util.Scanner;
/*
Прочитайте из консоли имя пользователя и выведите в консоль строку:
Привет, <имя пользователя>!
Подсказка:
Получите данные из консоли c помощью объекта Scanner, сохраните в
переменную userName и выведите в консоль с помощью System.out.println()
Ограничения:
0 < длина имени пользователя < 100
*/
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
    }
}
