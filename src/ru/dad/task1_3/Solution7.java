package ru.dad.task1_3;

import java.util.Scanner;

/*
7. Количество символов
Дана строка s.
Вычислить количество символов в ней, не считая пробелов (необходимо использовать цикл).

Ограничение:
0 < s.length() < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
Hello world

Пример выходных данных
10
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        do {
            s = scanner.nextLine();
        } while (!(s.length() > 0 && s.length() < 1000));

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
