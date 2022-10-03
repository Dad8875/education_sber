package ru.dad.task1_1;

import java.util.Scanner;
/*
На вход подается двузначное число n. Выведите число, полученное
перестановкой цифр в исходном числе n. Если после перестановки получается
ведущий 0, его также надо вывести.
Ограничения:
9 < count < 100
*/
public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 10 + "" + n / 10);
    }
}
