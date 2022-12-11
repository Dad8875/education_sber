package ru.dad.pm_1.task5;

import java.util.Scanner;

/*
5. Найти и исправить ошибки в следующем коде (сдать исправленный вариант):
public class Main {
public static void main(String[] args) {
int n = inputN();
System.out.println("Успешный ввод!");
}
private static int inputN() {
System.out.println("Введите число n, 0 < n < 100");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
if (n < 100 && n > 0) {
throw new Exception("Неверный ввод");
}
return n;
}
}

 */
public class Main {
    public static void main(String[] args) {
        try {
            int n = inputN();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Успешный ввод!");
    }

    public static int inputN() throws Exception {
        System.out.println("Введите число n, 0 < n < 100");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 100 || n <= 0) {
            throw new Exception("Неверный ввод");
        }
        return n;
    }
}
