package ru.dad.task1_3;

import java.util.Scanner;

/*
4. Цифры в столбик
Дано натуральное число n. Вывести его цифры в "столбик".

Ограничение:
0 < n < 1000000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
74

Пример выходных данных
7
4
 */
public class Solution4 {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
