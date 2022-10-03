package ru.dad.task1_1;

import java.util.Scanner;
/*
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
подается количество дюймов, выведите количество сантиметров.
Ограничения:
0 < count < 1000
*/
public class Solution5 {
    static final double INCH_IN_CM = 2.54;

    public static void main(String[] args) {

        System.out.println(new Scanner(System.in).nextDouble() * INCH_IN_CM);
    }
}
