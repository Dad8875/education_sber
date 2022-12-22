package ru.dad.pm_3.pensum.task1;

/*
1. Дана строка, состоящая из символов “(“ и “)”
Необходимо написать метод, принимающий эту строку и выводящий результат,
является ли она правильной скобочной последовательностью или нет.
Строка является правильной скобочной последовательностью, если:
● Пустая строка является правильной скобочной последовательностью.
● Пусть S — правильная скобочная последовательность, тогда (S) есть
правильная скобочная последовательность.
● Пусть S1, S2 — правильные скобочные последовательности, тогда S1S2
есть правильная скобочная последовательность.
Пример:
Входные данные Выходные данные

(()()())        true
)(              false
(()             false
((()))          true
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(isStringSequence("()()()"));
    }

    public static boolean isStringSequence(String s) {
        char[] chars = s.toCharArray();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[0] != '(' && chars[chars.length - 1] != ')') {
                return false;
            }
            if (chars[i] == '(') {
                count++;
            } else {
                count--;
            }
        }
        return count == 0;
    }
}
