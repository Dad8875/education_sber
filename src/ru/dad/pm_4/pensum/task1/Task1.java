package ru.dad.pm_4.pensum.task1;

/*
На вход подается две строки.
Необходимо определить, можно ли уравнять эти две строки, применив только одну из трех
возможных операций:
1. Добавить символ
2. Удалить символ
3. Заменить символ
Пример:
“cat” “cats” -> true
“cat” “cut” -> true
“cat” “nut” -> false
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(replaceOneSymbol("cut", "cat"));
    }

    public static boolean replaceOneSymbol(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        if (s1.length() == s2.length()) {
            int count = 0;
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    count++;
                }
            }
            return count <= 1;
        }
        if (s1.length() > s2.length()) {
            return s1.contains(s2);
        } else {
            return s2.contains(s1);
        }
    }
}
