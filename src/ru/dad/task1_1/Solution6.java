package ru.dad.task1_1;

import java.util.Scanner;
/*
На вход подается количество километров count. Переведите километры в мили
(1 миля = 1,60934 км) и выведите количество миль.
Ограничения:
0 < count < 1000
*/
public class Solution6 {
    static final double MILE_IN_KM = 1.60934;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextDouble();
        System.out.println(count / MILE_IN_KM);
    }
}
