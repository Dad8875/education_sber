package ru.dad.task1_2;

import java.util.Scanner;

/*
 Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
Ему хочется уметь разделять строку по первому пробелу. Для этого он может
воспользоваться методами indexOf() и substring().
На вход подается строка. Нужно вывести две строки, полученные из входной
разделением по первому пробелу.
Ограничения:
В строке гарантированно есть хотя бы один пробел
Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100
 */

public class Solution7 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        do {
            str = scanner.nextLine().trim();
        } while (!str.contains(" "));

        String str1 = str.substring(0, str.indexOf(" "));
        String str2 = str.substring(str.indexOf(" "));

        System.out.println(str1.trim());
        System.out.println(str2.trim());
    }
}
