package ru.dad.task1_2;

import java.util.Scanner;

/*
Раз так легко получается разделять по первому пробелу, Петя решил
немного изменить предыдущую программу и теперь разделять строку по
последнему пробелу.
Ограничения:
В строке гарантированно есть хотя бы один пробел
Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100

 */
public class Solution8 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        do {
            str = scanner.nextLine().trim();
        } while (!str.contains(" "));

        String str1 = str.substring(0, str.lastIndexOf(" "));
        String str2 = str.substring(str.lastIndexOf(" "));

        System.out.println(str1.trim());
        System.out.println(str2.trim());
    }
}
