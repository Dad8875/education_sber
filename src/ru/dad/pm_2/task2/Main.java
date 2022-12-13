package ru.dad.pm_2.task2;

import java.util.Arrays;
import java.util.Scanner;

/*
2. С консоли на вход подается две строки s и t. Необходимо вывести true, если
одна строка является валидной анаграммой другой строки и false иначе.
Анаграмма — это слово или фраза, образованная путем перестановки букв
другого слова или фразы, обычно с использованием всех исходных букв ровно
один раз.
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        System.out.println(isAnagramOfWord(s, t));
    }

    public static boolean isAnagramOfWord(String word1, String word2) {
        char[] chars = word1.toCharArray();
        char[] chars1 = word2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);

        return Arrays.equals(chars, chars1);
    }
}
