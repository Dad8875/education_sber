package ru.dad.task1_2.pensum;

import java.util.Scanner;

/*
У Марата был взломан пароль. Он решил написать программу,
которая проверяет его пароль на сложность. В интернете он узнал, что пароль
должен отвечать следующим требованиям:
● пароль должен состоять из хотя бы 8 символов;
● в пароле должны быть:
○ заглавные буквы
○ строчные символы
○ числа
○ специальные знаки(_*-)
Если пароль прошел проверку, то программа должна вывести в консоль строку пароль
надежный, иначе строку: пароль не прошел проверку
 */
public class Solution1 {
    public static void main(String[] args) {
        String password;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите новый пароль: ");
            password = scanner.nextLine();
        } while (password.length() < 8);

        if (!(password.contains("_") || password.contains("*") || password.contains("-"))){
            System.out.println("пароль не прошел проверку");
            return;
        }

        System.out.println(checkPassword(password) ? "пароль надежный" : "пароль не прошел проверку");
    }

    public static boolean checkPassword(String str) {
        char c;
        boolean isNumber = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isDigit(c)) {
                isNumber = true;
            } else if (Character.isUpperCase(c)) {
                isUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                isLowerCase = true;
            }
            if (isNumber && isUpperCase && isLowerCase) {
                return true;
            }
        }
        return false;
    }
}
